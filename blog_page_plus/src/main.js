import Vue from 'vue'
import App from './App.vue'
// 导入vue-router
import router from '@/router';
// router.afterEach((to, from, next) => {
//   window.scrollTo(0, 0);
// });
// 引入Markdown语法
import showdown from 'showdown';
// 引入vuex仓库
import store from './store';
// 引入图片懒加载插件
import VueLazyLoad from 'vue-lazyload';
//配置懒加载属性
Vue.use(VueLazyLoad, {
  preLoad: 1.3,
  error: require('./assets/logo.png'),//加载失败图片
  loading: require('./images/blog/post-2.jpg'),//加载图片
  attempt: 2,//尝试加载次数
})

// 关闭生产提示
Vue.config.productionTip = false
// 向Vue的原型上绑定showdown (Markdown转换html的实例)
Vue.prototype.$showdown = new showdown.Converter();

new Vue({
  render: h => h(App),
  // 注册路由 组件身上都会多了一个$route(该组件的路由-有几个路由组件就有几个)和$router(总的路由器-只有一个)属性
  router,
  // 注册仓库 组件实例身上会多了一个属性$store属性
  store,
}).$mount('#app')
