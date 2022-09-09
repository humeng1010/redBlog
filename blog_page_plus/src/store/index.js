// vuex
import Vue from 'vue';
import Vuex from 'vuex';
// 使用插件
Vue.use(Vuex);

// 引入仓库
import blogPage from './blogPage';
import adminPage from './adminPage';


// 对外暴露Store类的一个实例
export default new Vuex.Store({
    modules: {
        blogPage,
        adminPage
    }
})