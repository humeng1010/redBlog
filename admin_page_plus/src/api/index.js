import requests from './requests.js';

//登陆请求
export const login = (data) => requests.post('/user/login', data)

//查询博客请求
export const getBlogList = (data) => requests.get('/blog/list', data)