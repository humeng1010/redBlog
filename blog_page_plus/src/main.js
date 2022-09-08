import Vue from 'vue'
import App from './App.vue'
import router from '@/router';
import showdown from 'showdown';
Vue.config.productionTip = false
// 向Vue的原型上绑定showdown (Markdown转换html的实例)
Vue.prototype.$showdown = new showdown.Converter();

const vm = new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
// console.log(vm);
