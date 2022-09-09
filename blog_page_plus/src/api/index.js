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
 * 
 * @param {*} blogId 
 * @returns 对象
 */
export const getBlogById = (blogId) => pageRequestBase({ method: "GET", url: `/blogs/${blogId}` })