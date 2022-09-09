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
                  平头哥发布含光 800：高性能 AI 推理芯片
                </h1>
                <!-- 标签 -->
                <ul class="arc-meta">
                  <li><i class="mdi mdi-calendar"></i> 2019-09-25 09:21</li>
                  <li>
                    <i class="mdi mdi-tag-text-outline"></i> <a href="#">AI</a>,
                    <a href="#">芯片</a>
                  </li>
                  <li>
                    <i class="mdi mdi-comment-multiple-outline"></i>
                    <a href="#">3 评论</a>
                  </li>
                </ul>
              </div>
              <!-- 封面图片 -->
              <div class="arc-preview">
                <img
                  src="../../images/blog/post-1.png"
                  alt=""
                  class="img-fluid rounded"
                />
              </div>

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

              <div class="mt-5 blog-comment-title">
                <h5><span>评论 (5)</span></h5>
              </div>

              <ul class="media-list list-unstyled blog-comment">
                <li id="comment-1">
                  <div class="media">
                    <img
                      class="d-flex mr-3 rounded-circle"
                      src="images/author.jpg"
                      alt="花满楼"
                    />
                    <div class="media-body">
                      <a href="#!" class="text-custom reply-btn" data-id="1"
                        ><i class="mdi mdi-reply"></i>&nbsp; 回复</a
                      >
                      <h4 class="media-heading"><a href="#!">花满楼</a></h4>
                      <p class="text-muted post-date">2019-09-25 16:17</p>
                      <p>
                        只要你肯去领略，就会发现人生本是多么可爱，每个季节里都有很多足以让你忘记所有烦恼的赏心乐趣。
                      </p>
                    </div>
                  </div>
                </li>

                <li id="comment-2">
                  <div class="media">
                    <img
                      class="d-flex mr-3 rounded-circle"
                      src="images/author.jpg"
                      alt="陆小凤"
                    />
                    <div class="media-body">
                      <a href="#!" class="text-custom reply-btn" data-id="2"
                        ><i class="mdi mdi-reply"></i>&nbsp; 回复</a
                      >
                      <h4 class="media-heading"><a href="#!">陆小凤</a></h4>
                      <p class="text-muted post-date">2019-07-06 15:32</p>
                      <p>有的人求名，有的人求利，我求的是什么呢？</p>
                    </div>
                  </div>
                  <ul class="comment-children">
                    <li id="comment-3">
                      <div class="media">
                        <img
                          class="d-flex mr-3 rounded-circle"
                          src="images/author.jpg"
                          alt="西门吹雪"
                        />
                        <div class="media-body">
                          <a href="#!" class="text-custom reply-btn" data-id="3"
                            ><i class="mdi mdi-reply"></i>&nbsp; 回复</a
                          >
                          <h4 class="media-heading">
                            <a href="#!">西门吹雪</a>
                          </h4>
                          <p class="text-muted post-date">2019-07-06 15:36</p>
                          <p>麻烦！</p>
                        </div>
                      </div>
                    </li>
                  </ul>
                </li>

                <li id="comment-4">
                  <div class="media">
                    <img
                      class="d-flex mr-3 rounded-circle"
                      src="images/author.jpg"
                      alt="楚留香"
                    />
                    <div class="media-body">
                      <a href="#!" class="text-custom reply-btn" data-id="4"
                        ><i class="mdi mdi-reply"></i>&nbsp; 回复</a
                      >
                      <h4 class="media-heading"><a href="#!">楚留香</a></h4>
                      <p class="text-muted post-date">2019-06-27 10:02</p>
                      <p>
                        闻君有白玉美人，妙手雕成，极尽妍态,
                        不胜心向往之。今夜子正,当踏月来取,
                        君素雅达，必不致令我徒劳往返也。
                      </p>
                    </div>
                  </div>
                </li>

                <li id="comment-5">
                  <div class="media">
                    <img
                      class="d-flex mr-3 rounded-circle"
                      src="images/author.jpg"
                      alt="傅红雪"
                    />
                    <div class="media-body">
                      <a href="#!" class="text-custom reply-btn" data-id="5"
                        ><i class="mdi mdi-reply"></i>&nbsp; 回复</a
                      >
                      <h4 class="media-heading"><a href="#!">傅红雪</a></h4>
                      <p class="text-muted post-date">2019-06-26 11:45</p>
                      <p>
                        一把刀，一条没有退路的征途；一个人，一个孤独而又寂寞的灵魂！
                      </p>
                    </div>
                  </div>
                </li>
              </ul>

              <div id="respond" class="comment-respond">
                <div class="mt-2">
                  <h5>
                    <span>说点什么吧...</span>
                    <small class="cancel-comment-reply" onclick="cancelReply()"
                      >(取消回复)</small
                    >
                  </h5>
                </div>

                <form action="#" method="post" class="-4 blog-comment-form">
                  <div class="row">
                    <div class="col-sm-6">
                      <div class="form-group">
                        <input
                          id="author"
                          class="form-control"
                          placeholder="昵称*"
                          name="author"
                          type="text"
                          required=""
                        />
                      </div>
                    </div>

                    <div class="col-sm-6">
                      <div class="form-group">
                        <input
                          id="email"
                          class="form-control"
                          placeholder="邮箱*"
                          name="email"
                          type="text"
                          required=""
                        />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-sm-12">
                      <div class="form-group">
                        <input
                          id="subject"
                          class="form-control"
                          placeholder="网址"
                          name="subject"
                          type="text"
                        />
                      </div>
                    </div>
                  </div>

                  <div class="row">
                    <div class="col-sm-12">
                      <div class="form-group">
                        <textarea
                          id="comment"
                          class="form-control"
                          rows="5"
                          placeholder="想说的内容"
                          name="comment"
                          required=""
                        ></textarea>
                      </div>
                    </div>
                  </div>

                  <div class="row">
                    <div class="col-sm-12">
                      <div class="form-group">
                        <button
                          name="submit"
                          type="submit"
                          id="submit"
                          class="btn btn-primary"
                        >
                          发表评论
                        </button>
                        <input
                          type="hidden"
                          name="comment_arc_id"
                          value="1"
                          id="comment_arc_id"
                        />
                        <input
                          type="hidden"
                          name="comment_parent"
                          id="comment_parent"
                          value="0"
                        />
                      </div>
                    </div>
                  </div>
                </form>
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
// 引入代码高亮
import hljs from "highlight.js";
import "highlight.js/styles/monokai-sublime.css";
export default {
  data() {
    return {
      container: "",
    };
  },
  mounted() {
    // 显示Markdown到页面上
    this.showContainer();
    // 加载代码高亮显示
    hljs.highlightAll();
  },
  methods: {
    // 把博客内容加载到页面上
    showContainer() {
      this.container = this.$showdown.makeHtml("##h2");
    },
  },
};
</script>

<style>
</style>