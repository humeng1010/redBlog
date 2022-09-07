const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  //配置跨域
  devServer: {
    proxy: {
      '/api': {// 匹配所有以 '/api1'开头的请求路径
        target: 'http://localhost:8082/',// 代理目标的基础路径
        changeOrigin: true,
        pathRewrite: { '^/api': '' }//删除掉请求前缀/api
      },
    }
  }
})
