<template>
  <div class="blog-wrapper">
    <section class="mt-5 pb-5">
      <div class="container">
        <div class="row">
          <!-- 文章列表 -->
          <div class="col-xl-8">
            <!-- 使用v-for遍历article -->
            <article
              class="blog-arc"
              v-for="(blog, index) in blogList"
              :key="blog.blogId"
            >
              <div class="arc-header">
                <!-- 标题 -->
                <h2 class="arc-title">
                  <router-link
                    @click="addViews(blog)"
                    :to="{
                      name: 'blog',
                      params: {
                        id: blog.blogId,
                      },
                    }"
                  >
                    {{ blog.blogTitle }}
                  </router-link>
                </h2>
                <!-- 标签 -->
                <ul class="arc-meta">
                  <li>
                    <i class="mdi mdi-calendar"></i>
                    <!-- 更新时间 -->
                    创建时间:
                    {{ blog.createTime }}
                  </li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i>
                    <!-- 博客标签 -->
                    <i>{{ blog.blogLikeCount }} 点赞</i>,
                    <i>{{ blog.blogTitle }}</i>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <i> {{ blog.blogViews }} 浏览</i>
                  </li>
                </ul>
              </div>
              <!-- 封面 -->
              <div
                class="arc-preview"
                @click="
                  viewBlog(blog.blogId);
                  addViews(blog);
                "
              >
                <img v-lazy="blog.blogCover" alt="" class="img-fluid rounded" />
              </div>
              <!-- 简介 -->
              <div class="arc-synopsis">
                <!-- 显示内容的前十个字 -->
                <p>
                  {{ blog.blogDescription }}
                  ...
                </p>
              </div>
            </article>

            <!-- 分页 -->
            <div class="row">
              <div class="col-lg-12">
                <ul class="pagination">
                  <li class="page-item">
                    <a class="page-link" href="#"
                      ><i class="mdi mdi-chevron-left"></i
                    ></a>
                  </li>
                  <li class="page-item active">
                    <a class="page-link" href="#">1</a>
                  </li>
                  <li class="page-item"><a class="page-link" href="#">2</a></li>
                  <li class="page-item"><a class="page-link" href="#">3</a></li>
                  <li class="page-item"><a class="page-link" href="#">4</a></li>
                  <li class="page-item"><a class="page-link" href="#">5</a></li>
                  <li class="page-item">
                    <a class="page-link" href="#"
                      ><i class="mdi mdi-chevron-right"></i
                    ></a>
                  </li>
                </ul>
              </div>
            </div>
            <!-- 分页 end -->
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
import { mapActions, mapState } from "vuex";

export default {
  data() {
    return {};
  },
  computed: {
    ...mapState("blogPage", ["blogList"]),
  },
  mounted() {
    // 派发action：通过Vuex发起ajax请求，将数据存储到store中
    // this.$store.dispatch("blogPage/getBlogList");
    // 调用映射的action方法
    try {
      this.getBlogList();
    } catch (error) {
      console.log("服务错误");
    }
  },
  methods: {
    // 使用mapActions映射获取到$store中actions中的方法
    ...mapActions("blogPage", ["getBlogList"]),
    // 编程式路由跳转
    viewBlog(blogId) {
      this.$router.push({ path: `/blog/${blogId}` });
    },
  },
};
</script>

<style>
/* --------------------------------- *
 * 右侧
 * --------------------------------- */
.blog-wrapper {
  margin-left: 360px;
  padding: 1.5rem 3rem 0;
  height: 100%;
}

/* 文章列表 */
.blog-arc {
  margin: 0 0 45px;
}

.arc-header {
  margin: 0 0 30px;
}

.arc-title {
  font-size: 24px;
  margin: 0 0 10px;
  cursor: pointer;
  transition: all 0.5s;
}
.arc-title:hover {
  color: #007bff;
}

.arc-meta {
  list-style: none;
  padding: 0;
  margin: 0;
  opacity: 0.7;
}

.arc-meta > li {
  display: inline-block;
  margin-right: 30px;
}

.arc-preview {
  -webkit-transition: all 0.3s ease-out;
  transition: all 0.3s ease-out;
  margin: 0 0 25px;
}

.arc-preview:hover {
  opacity: 0.7;
}

/* 侧边栏 */
.blog-sidebar {
  padding-left: 30px;
}

.widget {
  margin: 0 0 40px;
}

.blog-sidebar .widget:last-child {
  border: 0;
  padding: 0;
}

.widget-title {
  position: relative;
  margin: 0 0 25px;
  font-weight: 700;
  text-transform: uppercase;
}

.widget-title:before {
  content: "";
  display: block;
  position: absolute;
  bottom: 0;
  width: 100%;
  border-bottom: 1px solid #eee;
}

.widget-title:after {
  content: "";
  display: block;
  width: 35px;
  z-index: 1;
  position: relative;
  margin: 15px auto 25px 0px;
  border-bottom: 1px solid #007bff;
}

.widget ul,
.widget ol {
  list-style: none;
  padding: 0;
  margin: 0;
}

.widget ul li,
.widget ol li {
  padding-bottom: 10px;
  margin-bottom: 10px;
}

.widget ul li:last-child,
.widget ol li:last-child {
  border: 0;
}

.widget-hot-posts ul li {
  border-bottom: 1px solid rgba(238, 238, 238, 0.7);
  margin-bottom: 15px;
  padding-bottom: 15px;
}

.widget-hot-posts ul li span {
  display: block;
  margin-top: 5px;
  opacity: 0.7;
}

/* 文章简介 */
.arc-synopsis p {
  margin: 0 0 20px;
  line-height: 1.7;
}

/* 文章详细 */
.blog-arc-detail {
  font-size: 16px;
}

.blog-arc-detail h1,
.blog-arc-detail h2,
.blog-arc-detail h3,
.blog-arc-detail h4,
.blog-arc-detail h5,
.blog-arc-detail h6 {
  margin: 30px 0 20px;
}

.blog-arc-detail h1:first-child,
.blog-arc-detail h2:first-child,
.blog-arc-detail h3:first-child,
.blog-arc-detail h4:first-child,
.blog-arc-detail h5:first-child,
.blog-arc-detail h6:first-child {
  margin-top: 0;
}

.blog-arc-detail p,
.blog-arc-detail ul,
.blog-arc-detail ol {
  margin: 0 0 20px;
  line-height: 1.7;
}

.blog-arc-detail blockquote {
  font-size: 16px;
  position: relative;
  padding: 20px 20px 20px 40px;
  margin-bottom: 20px;
}

.blog-arc-detail blockquote:before,
.blog-arc-detail .blockquote:before {
  content: "\F756";
  position: absolute;
  top: 0px;
  left: 10px;
  color: #cdced0;
  font-family: Material Design Icons;
  font-size: 100px;
  font-weight: 100;
  line-height: 0.5;
  opacity: 0.1;
}

.blog-arc-detail blockquote:after {
  position: absolute;
  top: 0;
  left: 0;
  width: 5px;
  height: 100%;
  background: #dee2e6;
  content: "";
}

/* 评论 */
.blog-comment-title {
  padding-top: 20px;
  margin-bottom: 20px;
  border-top: 1px solid #f5f5f5;
  border-bottom: 1px solid #f5f5f5;
}

.blog-comment,
.blog-comment .media {
  margin-top: 50px;
}

.blog-comment img {
  width: 60px;
}

.blog-comment .media-body a.reply-btn {
  float: right;
  text-transform: uppercase;
  font-size: 12px;
}

.blog-comment .media-heading {
  font-size: 14px;
  font-weight: 700;
  margin-top: 0px;
  margin-bottom: 0.25rem;
  line-height: 1.7;
}

.blog-comment .media-body p.post-date {
  margin-bottom: 20px;
  font-size: 12px;
}

.comment-children {
  list-style: none;
}

.media-list .comment-respond {
  padding-left: 40px;
}

.cancel-comment-reply {
  display: none;
  cursor: pointer;
  padding-left: 10px;
  font-weight: normal;
}
</style>