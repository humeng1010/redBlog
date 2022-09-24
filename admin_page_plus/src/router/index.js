// 配置路由
import Vue from 'vue';
import VueRouter from 'vue-router';

// 引入路由
import Home from '@/pages/Home';
import Login from '@/pages/Login';
import BlogAdmin from '@/pages/BlogAdmin';
import Me from '@/pages/Me';


// 使用插件
Vue.use(VueRouter)

//#region 
// 先把VueRouter.prototype的push先备份一份
let originPush = VueRouter.prototype.push;
let originReplace = VueRouter.prototype.replace;
// 重写push和replace
// 第一个参数:告诉原来的push方法往哪跳
// 第二个参数：成功的回调
// 第三个参数：失败的回调
VueRouter.prototype.push = function (location, resolve, reject) {
    if (resolve && reject) {
        originPush.call(this, location, resolve, reject)
    } else {
        originPush.call(this, location, () => { }, () => { })
    }
}
VueRouter.prototype.replace = function (location, resolve, reject) {
    if (resolve && reject) {
        originReplace.call(this, location, resolve, reject)
    } else {
        originReplace.call(this, location, () => { }, () => { })
    }
}
//#endregion






// 配置路由
const router = new VueRouter({
    scrollBehavior(to, from, savedPosition) {
        // return { x: 0, y: 0, behavior: 'smooth' }
        // 如果通过浏览器的前进后退键那么还会回到原先的位置，不会回到顶部
        if (savedPosition) {
            return savedPosition
        } else {
            return { x: 0, y: 0, behavior: 'smooth' }
        }
    },
    routes: [
        {
            path: "/login",
            component: Login,
            meta: {
                show: false,
                title: '登录'
            }
        },
        {
            path: "/home",
            component: Home,
            meta: {
                show: true,
                title: '首页'
            }
        },
        {
            path: "/blog",
            component: BlogAdmin,
            meta: {
                show: true,
                title: '博客管理'
            }
        },
        {
            path: "/me",
            component: Me,
            meta: {
                show: true,
                title: '个人中心'
            }
        },
        {
            path: '*',
            redirect: "/home"
        }

    ]
})

// 前置守卫
// to:要去的路由
// from:来自哪个路由
// next:放行
router.beforeEach((to, from, next) => {
    // 如果要去的是登录页，直接放行
    if (to.path === '/login') {
        next();
        return;
    }
    // 如果要去的不是登录页，判定是否登录
    if (!localStorage.getItem('token')) {
        next('/login');
        return;
    }
    // 如果已经登录，直接放行
    next();
})

//全局后置守卫：初始化时执行、每次路由切换后执行
router.afterEach((to, from) => {
    if (to.meta.title) {
        document.title = to.meta.title //修改网页的title
    } else {
        document.title = '博客管理系统'
    }
})
export default router