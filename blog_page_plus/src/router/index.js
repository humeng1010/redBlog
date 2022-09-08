// 配置路由
import Vue from 'vue';
import VueRouter from 'vue-router';

// 引入路由
import Home from '../pages/Home';
import Blog from '../pages/Blog';
import About from '../pages/About';
import Skill from '../pages/Skill';

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
    routes: [
        {
            path: "/home",
            component: Home,

        },
        {
            name: "blog",
            path: "/blog/:id",
            component: Blog,
        },
        {
            path: "/skill",
            component: Skill
        },
        {
            path: "/about",
            component: About
        },
        // {
        //     // 指定params参数可传可不传加上一个问号'?'
        //     name: "search",
        //     path: "/search/:keyword?",
        //     component: Search,
        //     meta: { show: true },
        //     // 路由组件能不能传递props数据？
        //     // 能，而且有三种形式
        //     // 形式一：值为对象 传递的参数固定，灵活性差
        //     // props: { a: 999 }
        //     // 形式二：(接收不了query)，值为布尔值，如果为true，则会将该路由收到的params参数，以props的形式传给search路由页面
        //     // props: true
        //     // 形式三：函数写法
        //     props($route) {
        //         return {
        //             keyword: $route.params.keyword,
        //         }
        //     }
        // },

        {
            path: '*',
            redirect: "/home"
        }

    ]
})