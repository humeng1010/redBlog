import Vue from 'vue'
import App from './App.vue'
// 引入elementUI组件库
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
// 引入路由
import router from '@/router';
// 引入vuex仓库
import store from './store';
// 使用elementUI
Vue.use(ElementUI);

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router,
  store,
}).$mount('#app')
