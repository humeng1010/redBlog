const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer: {
    proxy: {
      '/admin': {
        target: 'http://localhost:8082',
        changeOrigin: true,
        pathRewrite: {
          '^/admin': ''
        }
      }
    }
  }
})
