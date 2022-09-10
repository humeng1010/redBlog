/**
 * 这个模块：API接口进行统一管理 API接口
 */
import pageRequestBase from './pageRequestBase';

/**
 * 获取博客列表
 * @returns 对象数组
 */
export const getAllBolg = () => pageRequestBase.get("/blogs")

/**
 * 根据blogId获取博客
 * @param {*} blogId 
 * @returns 对象
 */
export const getBlogById = (blogId) => pageRequestBase({ method: "GET", url: `/blogs/${blogId}` })

/**
 * 根据userId获取用户 不传递默认为 默认用户 方便以后拓展
 * @param {*} userid 
 * @returns 
 */
export const getUser = (userId = "8888888888888888888") => pageRequestBase.get(`/user/${userId}`)