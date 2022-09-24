import axios from 'axios';
//引入router
import router from '@/router';
//引入element-ui
import { Message } from 'element-ui';
//引入进度条
import NProgress from 'nprogress';
import 'nprogress/nprogress.css';

//创建axios实例
const service = axios.create({
    baseURL: "/admin", // api的base_url
    timeout: 5000 // 请求超时时间
});

// request拦截器
service.interceptors.request.use(config => {
    // Do something before request
    NProgress.start();
    //获取token
    const token = localStorage.getItem('token');
    //如果token存在，每个http header都加上token
    if (token) {
        config.headers['Authorization'] = token;
    }
    return config;
}, error => {
    Promise.reject(error);
});

// respone拦截器
service.interceptors.response.use(
    response => {
        NProgress.done();
        return response.data;
    },
    error => {
        //跳转到登录页面
        if (error.response.status === 502) {
            //清除token
            localStorage.removeItem('token');
            //跳转到登录页面
            router.replace('/login');
            //提示
            Message.error('登录过期，请重新登录');
        }
        return Promise.reject(error);
    }
);

export default service;