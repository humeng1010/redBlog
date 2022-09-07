import requests from './requests';

export const getAllBlogs = () => requests.get("/blogs");
