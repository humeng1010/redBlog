// 配置路由
import Vue from 'vue';
import VueRouter from 'vue-router';

// 引入路由
import Home from '@/pages/Home';
import Login from '@/pages/Login';


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
export default new VueRouter({
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
            path: "/home",
            component: Home,
            meta: {
                show: true
            }

        },
        {
            path: "/login",
            component: Login,
            meta: {
                show: false
            }
        },
        {
            path: '*',
            redirect: "/login"
        }

    ]
})