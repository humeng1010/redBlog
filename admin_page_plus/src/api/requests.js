import axios from 'axios';
//创建axios实例
const service = axios.create({
    baseURL: "/api", // api的base_url
    timeout: 5000 // 请求超时时间
});

// request拦截器
service.interceptors.request.use(config => {
    // Do something before request
    return config;
}, error => {
    console.log(error); // for debug
    Promise.reject(error);
});

// respone拦截器
service.interceptors.response.use(
    response => {
        /**
         * code为非20000是抛错
         * 可结合自己业务进行修改
         * */
        const res = response.data;
        if (res.code !== 20000) {
            return Promise.reject('error');
        }
        return response.data;
    },
    error => {
        console.log('err' + error);// for debug
        return Promise.reject(error);
    }
);

export default service;