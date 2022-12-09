<template>
  <div class="about">
    <div class="blog-wrapper">
      <section class="mt-5 pb-5">
        <div class="container">
          <div class="row">
            <!-- 文章列表 -->
            <div class="col-12">
              <article class="blog-arc">
                <div class="blog-arc-detail">
                  <h5 class="text-center mt-0 mb-3 pb-3 text-danger">关于</h5>
                  <p class="text-right">
                    <span class="text-success h5"> 作者:胡猛 </span>
                    <br />
                    <span>项目地址:</span>
                    <br />
                    <span>gitee:</span>
                    <a
                      class="text-success"
                      href="https://gitee.com/xiaohugitee/redBlog"
                      target="_blank"
                      >https://gitee.com/xiaohugitee/redBlog</a
                    >
                    <br />
                    <span>github:</span>
                    <a
                      class="text-success"
                      href="https://www.github.com/redyouzi/redBlog"
                      target="_blank"
                      >https://www.github.com/redyouzi/redBlog</a
                    >
                  </p>
                  <p>
                    一位普通的大学生,热爱web开发,在有学习一年的基础上,利用空余时间开发出的一个个人博客。

                    <span class="text-muted small">
                      (自己写着玩的一个小项目 存在很多不足之处)
                    </span>
                    <br />
                    本项目是一个基于
                    <span class="text-success h4"> SpringBoot </span>
                    和
                    <span class="text-success h4"> Vue </span>
                    的前后端分离的项目,并且使用了一些
                    <span class="text-success h4">设计模式</span>
                    <br />
                    <span class="text-muted">(属于技术学习性的项目)</span>
                  </p>

                  <p class="text-muted">
                    开发记录: <br />
                    前端: <br />
                    前端主要采用了vue框架 <br />
                    以及vue-router作为路由跳转实现单页面网页, <br />
                    还使用了vuex进行数据的统一管理以及请求的发送,使用BootStrat框架,以及媒体查询做响应式页面,博客内容支持了Markdown语法,
                    博客封面图片使用了懒加载优化页面的响应速度。<br />
                    后端: <br />
                    主要采用SpringBoot框架<br />
                    mybatis-plus 框架 <br />
                    连接mysql数据库
                  </p>
                  <h6><strong class="text-warning">特别鸣谢</strong></h6>
                  <ul>
                    <li>Vue</li>
                    <li>SpringBoot</li>
                  </ul>
                </div>
              </article>
            </div>
            <!-- 内容 end -->
          </div>
        </div>
        <!-- end container -->
      </section>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.about {
  height: 1000px;
}
</style>