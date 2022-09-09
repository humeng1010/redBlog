import axios from 'axios';
// 引入进度条
import nprogress from 'nprogress';
// 引入进度条的样式
import "nprogress/nprogress.css";
const instance = axios.create({
    baseURL: "/api",
    timeout: 5000
})

// 添加请求拦截器
instance.interceptors.request.use(function (config) {
    // 进度条开始
    nprogress.start();
    // 在发送请求之前做些什么
    const token = localStorage.getItem("token");
    if (token) {
        config.headers['authorization'] = token
    }
    console.log(`请求前携带token是${token}`);
    return config;
}, function (error) {
    // 对请求错误做些什么
    return Promise.reject(error);
});

// 添加响应拦截器
instance.interceptors.response.use(function (response) {
    nprogress.done();
    // 2xx 范围内的状态码都会触发该函数。
    // 对响应数据做点什么

    return response;
}, function (error) {
    // 超出 2xx 范围的状态码都会触发该函数。
    // 对响应错误做点什么
    console.log(error);
    if (error.response.status === 401) {

    }
    return Promise.reject(error);
});

export default instance