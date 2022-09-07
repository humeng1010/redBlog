// vuex
import Vue from 'vue';
import Vuex from 'vuex';
// 使用插件
Vue.use(Vuex);

// 引入小仓库
import header from '@/store/header';
import footer from '@/store/footer';
import main from '@/store/main';


// 对外暴露Store类的一个实例
export default new Vuex.Store({
    modules: {
        header,
        main,
        footer,
    }

})