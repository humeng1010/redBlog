<template>
  <!-- header标签css中含有背景动态修改 -->
  <header class="blog-header text-center">
    <div class="blog-header-container">
      <div class="blog-mask"></div>
      <h1 class="blog-blogger pt-lg-4 mb-0">
        <router-link to="/home">{{ user.userNickname }} 的博客</router-link>
      </h1>
      <!-- 小屏幕时候的下拉单 -->
      <nav class="navbar navbar-expand-lg">
        <a
          class="navbar-toggler"
          data-toggle="collapse"
          data-target="#navigation"
          aria-controls="navigation"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <div
            @click="isactive = !isactive"
            :class="{ 'is-active': isactive, 'blog-hamburger': true }"
          >
            <div class="hamburger-inner"></div>
          </div>
        </a>

        <div id="navigation" class="collapse navbar-collapse flex-column">
          <div class="profile-section pt-3 pt-lg-0">
            <!-- 头像 -->
            <router-link to="/home">
              <img
                class="profile-image mb-3 rounded-circle mx-auto"
                :src="user.userAvatar"
                width="120"
                height="120"
                alt="redyouzi"
              />
            </router-link>

            <!-- 个性签名 -->
            <div class="blog-sentence mb-3">
              {{ user.userSignature }}
            </div>
            <hr />
          </div>

          <!-- 切换页面 -->
          <ul class="navbar-nav flex-column text-center">
            <li class="nav-item active">
              <router-link class="nav-link" to="/home">首页</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/skill">技术</router-link>
              <!-- <a class="nav-link" href="index.html">技术</a> -->
            </li>
            <!-- 
            <li class="nav-item">
              <a class="nav-link" href="index.html">感悟</a>
            </li> -->
            <li class="nav-item">
              <router-link class="nav-link" to="/about">关于我</router-link>
            </li>
          </ul>

          <!-- 搜索 -->
          <div class="my-2 my-md-3">
            <form
              class="blog-search-form form-inline justify-content-center pt-3"
            >
              <input
                type="email"
                id="semail"
                name="semail1"
                class="form-control mr-md-1"
                placeholder="搜索关键词"
              />
            </form>
          </div>
        </div>
      </nav>
    </div>
  </header>
</template>

<script>
import { mapActions, mapState } from "vuex";
export default {
  data() {
    return {
      isactive: false,
    };
  },
  computed: {
    ...mapState("blogPage", ["user"]),
  },
  mounted() {
    this.getUserById();
  },
  methods: {
    ...mapActions("blogPage", ["getUserById"]),
  },
};
</script>

<style>
/* --------------------------------- *
 * 左侧
 * --------------------------------- */
.blog-header {
  position: fixed;
  left: 0;
  top: 0;
  height: 100vh;
  width: 360px;
  background: url("../../images/left-bg.jpg");
  background-repeat: no-repeat;
  background-color: #3d3d3d;
  background-size: cover;
  background-position: center center;
  color: #fff;
}
.blog-header-container {
  height: 100%;
}
.blog-header .navbar {
  padding: 2rem 1rem;
  z-index: 12;
}
/* 遮罩 */
.blog-mask {
  position: absolute;
  width: 100%;
  height: 100%;
  left: 0px;
  bottom: 0px;
  z-index: 10;
  background-color: rgba(0, 0, 0, 0.25);
}
/* 滚动条 */
.nicescroll-cursors {
  background-color: rgba(0, 0, 0, 0.125) !important;
  border: none !important;
}
/* logo */
.blog-blogger {
  position: relative;
  font-weight: normal;
  font-size: 1.25rem;
  color: #fff;
  z-index: 11;
}
.blog-blogger a {
  color: #fff;
}
/* 导航切换 */
.blog-header .navbar-toggler {
  position: relative;
  -webkit-opacity: 0.8;
  -moz-opacity: 0.8;
  opacity: 0.8;
  border: none;
  padding: 0 0.5rem;
}
.blog-hamburger {
  padding: 15px;
  display: inline-block;
  cursor: pointer;
  background-color: transparent;
  border: 0;
  margin: 0;
}
.blog-hamburger .hamburger-inner,
.blog-hamburger .hamburger-inner::before,
.blog-hamburger .hamburger-inner::after {
  width: 22px;
  height: 2px;
  background-color: #fff;
  position: absolute;
  transition-property: -webkit-transform;
  transition-property: transform;
  transition-property: transform, -webkit-transform;
  transition-duration: 0.15s;
  transition-timing-function: ease;
}
.blog-hamburger .hamburger-inner::before,
.blog-hamburger .hamburger-inner::after {
  content: "";
  display: block;
}
.blog-hamburger .hamburger-inner {
  top: 8px;
  left: 12px;
  transition-duration: 0.4s;
  transition-timing-function: cubic-bezier(0.68, -0.55, 0.265, 1.55);
}
.blog-hamburger .hamburger-inner::before {
  top: 7px;
  transition: opacity 0.15s 0.4s ease;
}
.blog-hamburger .hamburger-inner::after {
  top: 14px;
  transition: -webkit-transform 0.4s cubic-bezier(0.68, -0.55, 0.265, 1.55);
  transition: transform 0.4s cubic-bezier(0.68, -0.55, 0.265, 1.55);
  transition: transform 0.4s cubic-bezier(0.68, -0.55, 0.265, 1.55),
    -webkit-transform 0.4s cubic-bezier(0.68, -0.55, 0.265, 1.55);
}
.blog-hamburger.is-active .hamburger-inner {
  transform: translate3d(0, 8px, 0) rotate(135deg);
}
.blog-hamburger.is-active .hamburger-inner::before {
  transition-delay: 0s;
  opacity: 0;
}
.blog-hamburger.is-active .hamburger-inner::after {
  transform: translate3d(0, -15px, 0) rotate(-270deg);
}
/* 文字说明 */
.profile-section {
  max-width: 328px;
}
.blog-sentence {
  line-height: 2;
}
/* 导航栏目 */
.blog-header .nav-link {
  color: rgba(255, 255, 255, 0.8);
}
.blog-header .nav-link:hover {
  color: rgba(255, 255, 255, 1);
}
/* 搜索框 */
.blog-search-form .form-control {
  border-radius: 100px;
  background-color: rgba(255, 255, 255, 0.125);
  border-color: rgba(255, 255, 255, 0.125);
  color: #fff;
}
</style>