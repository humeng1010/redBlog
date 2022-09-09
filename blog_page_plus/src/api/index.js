/**
 * 这个模块：API接口进行统一管理 API接口
 */
import pageRequestBase from './pageRequestBase';

/**
 * 获取博客列表
 */
// export const getAllBolg = () => { return pageRequestBase.get("/blogs") }
export const getAllBolg = () => pageRequestBase.get("/blogs") 