<template>
  <div class="blog-wrapper">
    <section class="mt-5 pb-5">
      <div class="container">
        <div class="row">
          <!-- 文章阅读 -->
          <div class="col-xl-8">
            <article class="blog-arc">
              <div class="arc-header">
                <!-- 标题 -->
                <h1 class="arc-title">
                  {{ blog.blogTitle }}
                </h1>
                <!-- 标签 -->
                <ul class="arc-meta">
                  <li>
                    <i class="mdi mdi-calendar"></i> 创建时间:
                    {{ blog.createTime }}
                  </li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i>
                    <i href="#">{{ blog.blogLikeCount }} 点赞</i>,
                    <i href="#">{{ blog.blogTitle }}</i>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <i href="#"> {{ blog.blogViews }} 浏览</i>
                  </li>
                </ul>
              </div>
              <!-- 封面图片 -->
              <div class="arc-preview">
                <img :src="blog.blogCover" alt="" class="img-fluid rounded" />
              </div>

              <!-- <pre>
                <code class="java">
                  {{blog.blogContent}}
                </code>
              </pre> -->
              <!-- 正文内容支持Markdown语法 -->
              <div v-html="container"></div>

              <!-- 博客底部标签和评论 -->
              <div class="mt-5">
                <h6>Tags:</h6>
                <div class="tag-cloud">
                  <a href="#" class="badge badge-light">logo</a>
                  <a href="#" class="badge badge-light">AI</a>
                  <a href="#" class="badge badge-light">芯片</a>
                </div>
              </div>
            </article>
          </div>
          <!-- 内容 end -->

          <!-- 侧边栏 -->
          <div class="col-xl-4">
            <div class="blog-sidebar">
              <!-- 热门文章 -->
              <aside class="widget widget-hot-posts">
                <div class="widget-title">热门文章</div>
                <ul>
                  <li>
                    <a href="#"
                      >三星将为 Galaxy Fold 用户提供 149 美元更换屏幕服务</a
                    >
                    <span>2019-09-25 10:05</span>
                  </li>
                  <li>
                    <a href="#"
                      >专家：10年后6G将问世 数据传输速率有望比5G快100倍</a
                    >
                    <span>2019-09-25 08:06</span>
                  </li>
                  <li>
                    <a href="#"
                      >苹果正式发布 iPadOS 13.1 系统，加入多项强大新功能</a
                    >
                    <span>2019-09-25 09:35</span>
                  </li>
                </ul>
              </aside>

              <!-- 标签 -->
              <aside class="widget widget-tag-cloud">
                <div class="widget-title">标签</div>
                <div class="tag-cloud">
                  <a href="#" class="badge badge-default">vue</a>
                  <a href="#" class="badge badge-primary">ios</a>
                  <a href="#" class="badge badge-success">java</a>
                  <a href="#" class="badge badge-info">linux</a>
                  <a href="#" class="badge badge-warning">macos</a>
                  <a href="#" class="badge badge-danger">springboot</a>
                </div>
              </aside>
            </div>
          </div>
          <!-- 侧边栏 end -->
        </div>
      </div>
      <!-- end container -->
    </section>
  </div>
</template>

<script>
// 引入代码高亮
import hljs from "highlight.js";
import "highlight.js/styles/monokai-sublime.css";
import { mapActions, mapState } from "vuex";
export default {
  data() {
    return {
      theBlog: {},
      container: "",
    };
  },
  computed: {
    ...mapState("blogPage", ["blog"]),
  },
  mounted() {
    // 加载代码高亮显示
    hljs.highlightAll();
    //根据id获取博客
    this.getBlogWithId(this.$route.params.id);

    // 显示Markdown到页面上
    this.showContainer();
  },

  methods: {
    // 根据路由传递的参数查询博客数据
    ...mapActions("blogPage", ["getBlogWithId"]),
    // 把博客内容加载到页面上
    showContainer() {
      let count = 0;
      let interval = setInterval(() => {
        console.log("尝试渲染页面");
        count = count + 1;
        if (count > 5) {
          //如果尝试5次还没有获取到后台数据则停止
          clearInterval(interval);
          console.log("已停止");
        }
        if (this.blog.blogContent) {
          this.container = this.$showdown.makeHtml(this.blog.blogContent);
          console.log("页面已渲染");
          clearInterval(interval);
        }
      }, 200);
    },
  },
};
</script>

<style>
</style>