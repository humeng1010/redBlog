import { addViews, getAllBolg, getBlogById, getUser, skills } from '@/api';
// home模块数据仓库
const actions = {

    async getUserById({ commit }, userId) {
        const res = await getUser(userId);
        // console.log(res);
        if (res.data.success) {
            commit('GETUSERBYID', res.data.data)
        } else {
            return new Promise.reject(res)
        }
    },
    // 通过API里面的接口函数调用，向服务器发送请求，获取服务器的数据
    async getBlogList({ commit }) {
        try {
            const res = await getAllBolg();
            // console.log(res);
            // 如果响应成功
            if (res.data.success) {
                commit('GETBLOGLIST', res.data.data)
            }
        } catch (error) {
            console.log('服务无响应');
        }

    },

    async getBlogWithId({ commit }, blogId) {
        const res = await getBlogById(blogId);
        console.log(res);
        if (res.data.success) {
            commit("GETBLOGWITHID", res.data.data)
        }
    },

    async addBlogViews({ commit }, blog) {
        try {
            const res = await addViews(blog);
            console.log(res);
            if (res.data.success) {
                commit("ADDBLOGVIEWS", res.data.data)
            }
        } catch (error) {
            console.log(error);
        }
    },

    async getUserSkill({ commit }, userId) {
        try {
            const res = await skills();
            if (res.data.success) {
                commit("GETUSERSKILL", res.data.data)
            }
        } catch (error) {
            console.log(error);
        }

    }

}
const mutations = {
    GETUSERBYID(state, user) {
        state.user = user;
    },
    GETBLOGLIST(state, blogList) {
        state.blogList = blogList
    },
    GETBLOGWITHID(state, blog) {
        state.blog = blog
    },
    ADDBLOGVIEWS(state, newBlog) {
        state.blog = newBlog
    },
    GETUSERSKILL(state, skills) {
        state.skills = skills
    }
}
const state = {
    user: {},
    blogList: [],
    blog: {},
    skills: []

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