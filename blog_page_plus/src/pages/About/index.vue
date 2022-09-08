<template>
  <div class="blog-wrapper">
    <section class="mt-5 pb-5">
      <div class="container">
        <div class="row">
          <!-- 文章列表 -->
          <div class="col-12">
            <article class="blog-arc">
              <div class="blog-arc-detail">
                <h5 class="text-center mt-0 mb-3 pb-3">关于我</h5>
                <p>
                  笔下光年的博客是基于Bootstrap
                  v4.3.1的小清新风格博客模板，只有三个页面，首页，详细页和About页面，样式和js都不多，比较简单。
                </p>
                <p>
                  字体图标采用Material Design
                  Icons，其实模板本身用到的图标并不多，大家可以采用替代方案。<a
                    href="http://fontello.com/"
                    target="_blank"
                    >http://fontello.com/</a
                  >网站可以打包下载自己所需要的字体图标，这样就会大大减小字体图标的加载时间。
                </p>
                <h6><strong>特别鸣谢</strong></h6>
                <ul>
                  <li>Bootstrap</li>
                  <li>JQuery</li>
                  <li>Material Design Icons</li>
                  <li>highlight</li>
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
</template>

<script>
export default {};
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