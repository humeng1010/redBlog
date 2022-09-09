import { getAllBolg, getBlogById } from '@/api';
// home模块数据仓库
const actions = {
    // 通过API里面的接口函数调用，向服务器发送请求，获取服务器的数据
    async getBlogList({ commit }) {
        const res = await getAllBolg();
        console.log(res);
        // 如果响应成功
        if (res.data.success) {
            commit('GETBLOGLIST', res.data.data)
        }
    },

    async getBlogWithId({ commit }, blogId) {
        const res = await getBlogById(blogId);
        console.log(res);
        if (res.data.success) {
            commit("GETBLOGWITHID", res.data.data)
        }

    }

}
const mutations = {
    // 修改商品列表
    GETBLOGLIST(state, blogList) {
        state.blogList = blogList
    },
    GETBLOGWITHID(state, blog) {
        state.blog = blog
    }
}
const state = {
    blogList: [],
    blog: {}

}
const getters = {
    // blogList(state) {
    // }
}
export default {
    namespaced: true,//开启命名空间
    actions,
    mutations,
    state,
    getters
}