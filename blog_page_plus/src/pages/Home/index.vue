<template>
  <div class="blog-wrapper">
    <section class="mt-5 pb-5">
      <div class="container">
        <div class="row">
          <!-- 文章列表 -->
          <div class="col-xl-8">
            <!-- 使用v-for遍历article -->
            <article class="blog-arc">
              <div class="arc-header">
                <!-- 标题 -->
                <h2 class="arc-title">
                  <router-link
                    :to="{
                      name: 'blog',
                      params: {
                        id: 1,
                      },
                    }"
                  >
                    <span
                      >蔚来汽车宣布将在今日20点召开第二季度财报业绩电话会</span
                    >
                  </router-link>

                  <!-- <a href="post.html"
                    >蔚来汽车宣布将在今日20点召开第二季度财报业绩电话会</a
                  > -->
                </h2>
                <!-- 标签 -->
                <ul class="arc-meta">
                  <li><i class="mdi mdi-calendar"></i> 2019-09-25 09:21</li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i>
                    <i href="#">蔚来汽车</i>, <i href="#">财报</i>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <i href="#"> 3 评论</i>
                  </li>
                </ul>
              </div>
              <!-- 封面 -->
              <div class="arc-preview" @click="viewBlog">
                <!-- <router-link
                  :to="{
                    name: 'blog',
                    params: {
                      id: 1,
                    },
                  }"
                > -->
                <img
                  src="../../images/blog/post-1.png"
                  alt=""
                  class="img-fluid rounded"
                />
                <!-- </router-link> -->
              </div>
              <!-- 简介 -->
              <div class="arc-synopsis">
                <p>
                  今日，蔚来宣布将在北京时间周三20:
                  00召开第二季度财报业绩电话会议。昨日，蔚来汽车公布了截至 2019
                  年 6 月 30 日未经审计的第二季度财报。财报财报显示，蔚来 2019
                  第二季度获得总营收15. 086
                  亿元，环比下降7.5%同比增长3180.1%;净亏损32. 858
                  亿元，环比增长25.2%，同比增长83.1%。
                </p>
              </div>
            </article>

            <article class="blog-arc">
              <div class="arc-header">
                <h2 class="arc-title">
                  <a href="post.html"
                    >苹果 CEO 库克：Apple 已完全使用可再生能源供电</a
                  >
                </h2>
                <ul class="arc-meta">
                  <li><i class="mdi mdi-calendar"></i> 2019-09-25 09:20</li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i>
                    <a href="#">苹果</a>, <a href="#">Apple</a>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <a href="#">37 评论</a>
                  </li>
                </ul>
              </div>

              <div class="arc-preview">
                <a href="#"
                  ><img
                    src="../../images/blog/post-1.png"
                    alt=""
                    class="img-fluid rounded"
                /></a>
              </div>

              <div class="arc-synopsis">
                <p>
                  苹果 CEO 库克在微博上表示，「我们很自豪 Apple
                  已完全使用可再生能源供电，并携手我们的供应商共同朝这个方向努力。明年我们将有超过
                  6000
                  兆瓦的新可再生能源并网，包括位于湖南和湖北的三座新风电场。」
                </p>
              </div>
            </article>

            <article class="blog-arc">
              <div class="arc-header">
                <h2 class="arc-title">
                  <a href="post.html"
                    >韭菜扎心！比特币一度跌破8000美元 24小时跌幅10.6%</a
                  >
                </h2>
                <ul class="arc-meta">
                  <li><i class="mdi mdi-calendar"></i> 2019-09-25 09:19</li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i>
                    <a href="#">比特币</a>, <a href="#">韭菜</a>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <a href="#">90 评论</a>
                  </li>
                </ul>
              </div>

              <div class="arc-synopsis">
                <p>
                  本周二，比特币迎来了一轮暴跌，根据行情显示，比特币今日凌晨曾一度跌破
                  8000 美元，现报约8723美元，恐怕这让一大波韭菜们相当扎心。
                </p>
              </div>
            </article>

            <article class="blog-arc">
              <div class="arc-header">
                <h2 class="arc-title">
                  <a href="post.html"
                    >数十万 PhpStudy
                    用户被植入后门，快来检测你是否已沦为“肉鸡”！</a
                  >
                </h2>
                <ul class="arc-meta">
                  <li><i class="mdi mdi-calendar"></i> 2019-09-24 09:57</li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i>
                    <a href="#">PhpStudy</a>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <a href="#">115 评论</a>
                  </li>
                </ul>
              </div>

              <div class="arc-preview">
                <a href="#"
                  ><img
                    src="../../images/blog/post-2.jpg"
                    alt=""
                    class="img-fluid rounded"
                /></a>
              </div>

              <div class="arc-synopsis">
                <p>
                  北京时间9月20日，杭州公安发布《杭州警方通报打击涉网违法犯罪暨‘净网2019’专项行动战果》一文，文章曝光了国内知名PHP调试环境程序集成包“PhpStudy软件”遭到黑客篡改并植入“后门”。截...
                </p>
              </div>
            </article>

            <article class="blog-arc">
              <div class="arc-header">
                <h2 class="arc-title">
                  <a href="post.html"
                    >效力微软 15 年的前员工解释 Windows 10 为什么问题如此多</a
                  >
                </h2>
                <ul class="arc-meta">
                  <li><i class="mdi mdi-calendar"></i> 2019-09-24 07:52</li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i>
                    <a href="#">windows</a>, <a href="#">win10</a>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <a href="#">26 评论</a>
                  </li>
                </ul>
              </div>

              <div class="arc-synopsis">
                <p>
                  众所周知 Windows 10
                  系统问题频发，整体来说稳定性比较差，然而在此之前的版本其实相对来说稳定性还挺好的。自从
                  Windows 10
                  正式版推出之时，该系统就开始频繁出现问题，乃至现在每个月安全...
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

              <!-- 归档 -->
              <aside class="widget">
                <div class="widget-title">归档</div>
                <ul>
                  <li><a href="#">2019 三月</a> (40)</li>
                  <li><a href="#">2019 四月</a> (08)</li>
                  <li><a href="#">2019 五月</a> (11)</li>
                  <li><a href="#">2019 六月</a> (21)</li>
                </ul>
              </aside>

              <!-- 标签 -->
              <aside class="widget widget-tag-cloud">
                <div class="widget-title">标签</div>
                <div class="tag-cloud">
                  <a href="#" class="badge badge-light">php</a>
                  <a href="#" class="badge badge-primary">苹果</a>
                  <a href="#" class="badge badge-danger">比特币</a>
                  <a href="#" class="badge badge-light">linux</a>
                  <a href="#" class="badge badge-light">前端</a>
                  <a href="#" class="badge badge-light">vue</a>
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
export default {
  data() {
    return {
      blog: {
        id: 1,
      },
    };
  },
  methods: {
    // 编程式路由跳转
    viewBlog() {
      this.$router.push({ path: `/blog/${this.blog.id}` });
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