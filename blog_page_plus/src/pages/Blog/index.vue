<template>
  <div class="blog-wrapper">
    <section class="mt-5 pb-5">
      <div class="container">
        <div class="row">
          <!-- 文章阅读 -->
          <div class="col-xl-8">
            <article class="blog-arc">
              <div class="arc-header">
                <h2 class="arc-title">
                  <a href="#">平头哥发布含光 800：高性能 AI 推理芯片</a>
                </h2>
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

              <div class="arc-preview">
                <img
                  src="images/blog/post-1.png"
                  alt=""
                  class="img-fluid rounded"
                />
              </div>

              <div class="blog-arc-detail">
                <p>
                  去年 9
                  月在杭州云栖大会上，阿里巴巴正式宣布成立芯片公司“平头哥半导体有限公司”，它由阿里去年
                  4
                  月收购的国产芯片企业中天微与阿里旗下达摩院芯片团队整合而成，“平头哥”自此横空出世。
                </p>

                <h3>生活有度，人生添寿。</h3>
                <p>
                  今年 7 月，<a href="#" target="_blank"
                    >平头哥正式发布玄铁 910</a
                  >，据称这是目前业界最强的 RISC-V 处理器。
                </p>
                <p>
                  时隔两个月，今天在杭州举办的云栖大会上，“平头哥”推出了高性能
                  AI 推理芯片含光 800。含光 800
                  是阿里成立平头哥芯片公司后第一款正式流片的芯片。这是阿里里巴巴第一次使用了自己的一套硬件架构，也是互联网公司研发的第一款大芯片。
                </p>
                <pre><code>function $initHighlight(block, cls) {
  try {
    if (cls.search(/\bno\-highlight\b/) != -1)
      return process(block, true, 0x0F) +
             ` class=&quot;${cls}&quot;`;
  } catch (e) {
    /* handle exception */
  }
  for (var i = 0 / 2; i &lt; classes.length; i++) {
    if (checkCondition(classes[i]) === undefined)
      console.log(&#39;undefined&#39;);
  }
}

export  $initHighlight;
</code></pre>
                <h3>排版</h3>
                <p>
                  达摩院院长张建锋宣布了这则消息，并表示：&ldquo;在全球芯片领域，阿里巴巴是一个新人，玄铁和含光
                  800 是平头哥的万里长征第一步，我们还有很长的路要走。&rdquo;
                </p>
                <p>
                  据了解，在业界标准的 ResNet-50 测试中，含光 800 推理性能达到
                  78563 IPS，比目前业界最好的 AI 芯片性能高 4 倍；能效比 500
                  IPS/W，是第二名的 3.3 倍。在杭州城市大脑的业务测试中，1 颗含光
                  800 的算力相当于 10 颗 GPU。
                </p>
                <p>
                  含光 800
                  性能的突破得益于软硬件的协同创新：硬件层面采用自研芯片架构，通过推理加速等技术有效解决芯片性能瓶颈问题；软件层面集成了达摩院先进算法，针对
                  CNN 及视觉类算法深度优化计算、存储密度，可实现大网络模型在一颗
                  NPU 上完成计算。
                </p>

                <h5>列表:</h5>
                <ul>
                  <li>Lorem ipsum dolor sit amet consectetuer.</li>
                  <li>Aenean commodo ligula eget dolor.</li>
                  <li>Aenean massa cum sociis natoque penatibus.</li>
                </ul>
                <ol>
                  <li>Lorem ipsum dolor sit amet consectetuer.</li>
                  <li>Aenean commodo ligula eget dolor.</li>
                  <li>Aenean massa cum sociis natoque penatibus.</li>
                </ol>
                <h5>引用示例:</h5>
                <blockquote class="blockquote">
                  <p>
                    土地是以它的肥沃和收获而被估价的；才能也是土地，不过它生产的不是粮食，而是真理。如果只能滋生瞑想和幻想的话，即使再大的才能也只是砂地或盐池，那上面连小草也长不出来的。
                  </p>
                  <footer class="blockquote-footer">别林斯基</footer>
                </blockquote>

                <h5>表格示例:</h5>
                <table class="table table-striped">
                  <thead>
                    <tr>
                      <th scope="col">#</th>
                      <th scope="col">First</th>
                      <th scope="col">Last</th>
                      <th scope="col">Handle</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <th scope="row">1</th>
                      <td>Mark</td>
                      <td>Otto</td>
                      <td>@mdo</td>
                    </tr>
                    <tr>
                      <th scope="row">2</th>
                      <td>Jacob</td>
                      <td>Thornton</td>
                      <td>@fat</td>
                    </tr>
                    <tr>
                      <th scope="row">3</th>
                      <td>Larry</td>
                      <td>the Bird</td>
                      <td>@twitter</td>
                    </tr>
                  </tbody>
                </table>

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
                            <a
                              href="#!"
                              class="text-custom reply-btn"
                              data-id="3"
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
                      <small
                        class="cancel-comment-reply"
                        onclick="cancelReply()"
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