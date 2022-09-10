<template>
  <div>
    <Header></Header>
    <transition
      name="animate__animated animate__bounce"
      enter-active-class="animate__pulse"
      leave-active-class="animate__pulse"
    >
      <router-view></router-view>
    </transition>
  </div>
</template>

<script>
import "animate.css";
import Header from "./components/Header/Header.vue";
export default {
  name: "App",
  components: {
    Header,
  },
};
</script>

<style>
/* --------------------------------- *
 * 响应式处理
 * --------------------------------- */
@media only screen and (max-width: 991px) {
  .blog-header .blog-blogger {
    width: 100%;
    position: absolute;
    left: 0;
    top: 1.2rem;
  }
}

@media only screen and (max-width: 992px) {
  .blog-header {
    position: relative;
    width: inherit;
    height: auto;
  }

  .blog-header .navbar {
    padding: 1rem;
  }

  .blog-wrapper {
    margin-left: 0px !important;
  }

  .profile-section {
    max-width: 100%;
  }
}

/* 当最大宽度小于1200px的时候隐藏侧边栏 */
@media only screen and (max-width: 1200px) {
  .blog-sidebar {
    padding-left: 0px;
    margin-top: 1.5rem;
  }
}

/* --------------------------------- *
 * 重设样式
 * --------------------------------- */
body {
  font-family: -apple-system, BlinkMacSystemFont, Helvetica Neue, PingFang SC,
    Microsoft YaHei, Source Han Sans SC, Noto Sans CJK SC, WenQuanYi Micro Hei,
    sans-serif;
  font-size: 14px;
  line-height: 1.7;
  background-color: #fff;
  color: #4d5259;
}

a {
  color: #4d5259;
  text-decoration: none;
  -webkit-transition: color 0.5s, background-color 0.5s;
  -o-transition: color 0.5s, background-color 0.5s;
  transition: color 0.5s, background-color 0.5s;
}

a:hover,
a:active,
a:focus {
  outline: none;
  text-decoration: none;
}

i[class*="mdi"] {
  vertical-align: middle;
}

.h1,
.h2,
.h3,
.h4,
.h5,
.h6,
h1,
h2,
h3,
h4,
h5,
h6 {
  line-height: 1.7;
}

.form-control {
  font-size: 14px;
  -webkit-border-radius: 2px;
  -o-border-radius: 2px;
  border-radius: 2px;
}

.btn {
  -webkit-border-radius: 2px;
  -o-border-radius: 2px;
  border-radius: 2px;
}

.badge {
  -webkit-border-radius: 2px;
  -o-border-radius: 2px;
  border-radius: 2px;
  font-weight: normal;
  margin: 5px 10px 5px 0;
  padding: 5px 8px 5px 10px;
}

.page-link {
  color: #8b95a5;
  border-color: #ebebeb;
  padding: 0 8px;
  margin: 0 3px;
  min-width: 31px;
  max-height: 31px;
  line-height: 29px;
  text-align: center;
  -webkit-border-radius: 2px;
  -o-border-radius: 2px;
  border-radius: 2px;
}

.page-item:first-child .page-link,
.page-item:last-child .page-link {
  -webkit-border-radius: 2px;
  -o-border-radius: 2px;
  border-radius: 2px;
}

.page-link:hover,
.page-link:focus {
  color: #4d5259;
}
</style>
