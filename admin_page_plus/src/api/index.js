import requests from './requests.js';


//查询博客请求
export const getBlogList = () => requests.get('/adminBlog')

//登陆请求
export const loginBlog = (data) => requests.post('/login', data)

//根据id查询用户
export const userInfo = (id = "8888888888888888888") => requests.get(`/adminUser/${id}`)

//修改用户信息 - 不包含密码 否则密码是明文
export const updateUserInfo = (data) => requests.put('/adminUser/update', data)

//修改密码 - 加密的密码
export const updatePassword = (data) => requests.put('/adminUser/updatePassword', data)


