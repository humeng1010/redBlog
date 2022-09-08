// 配置路由
import Vue from 'vue';
import VueRouter from 'vue-router';

// 引入路由
import blogHome from '@/pages/blogHome';
import loginBlog from '@/pages/loginBlog';
import blog from '@/pages/blogHome/blog/blog';
import blogEdit from '@/pages/blogHome/blog/blogEdit';
import blogList from '@/pages/blogHome/blogList';

// 使用插件
Vue.use(VueRouter)

// 先把VueRouter.prototype的push先备份一份
let originPush = VueRouter.prototype.push;
let originReplace = VueRouter.prototype.replace;
// 重写push和replace
// 第一个参数:告诉原来的push方法往哪跳
// 第二个参数：成功的回调
// 第三个参数：失败的回调
// call与apply的区别
// 相同点：都可以调用一次函数，都可以篡改函数的上下文一次
// 不同点：call与apply传递参数：call传递参数使用逗号隔开，apply方法执行，传递数组
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

// 配置路由
export default new VueRouter({
    routes: [
        // 博客列表
        {
            path: '/blogList',
            component: blogList,
            meta: { show: true },
            children: [
                // 博客
                {
                    path: '/:id',
                    component: blog,
                    meta: { show: true },
                },
            ]
        },
        // 主页
        {
            path: "/home",
            component: blogHome,
            meta: { show: true }
        },



        // --------------------------后台管理------------------
        //后台登陆页面
        {
            path: "/login",
            component: loginBlog,
            meta: { show: false }
        },

        // 编辑
        {
            path: '/edit',
            component: blogEdit,
            meta: { show: false },
        },


        // 重定向,当访问根目录的时候直接重定向到home页
        {
            path: '*',
            redirect: "/home"
        }

    ]
})