import requests from './requests.js';


//查询博客请求
export const getBlogList = () => requests.get('/adminBlog')

//登陆请求
export const loginBlog = (data) => requests.post('/login', data)
