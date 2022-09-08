<template>
  <div>
    <Header></Header>
    <router-view></router-view>
  </div>
</template>

<script>
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
</style>
