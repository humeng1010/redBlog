<template>
  <div class="app">
    <div class="welcome">欢迎访问redyouzi的博客</div>
    <div class="nav">
      <div class="blog">
        <router-link to="/blog"> 博客 </router-link>
      </div>
      <div class="photos">
        <router-link to="/home"> 随记 </router-link>
      </div>
      <div class="home">
        <router-link to="/home">
          <img class="avatar" src="../../img/avatar.png" alt="" />
        </router-link>
      </div>
      <div class="home">
        <router-link to="/home">
          <img class="avatar" src="../../img/avatar.png" alt="" />
        </router-link>
      </div>
      <div class="home">
        <router-link to="/home">
          <img class="avatar" src="../../img/avatar.png" alt="" />
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.app {
  /* 粘性定位 */
  position: sticky;
  /* 当距离顶部0像素则固定该元素 */
  top: -59px;
  overflow: hidden;
  width: 100%;
  height: 200px;
  background-color: #6cf;
  background-image: linear-gradient(#6cf, rgb(255, 234, 236));
}
.app .welcome {
  margin-top: 20px;
  text-align: center;
  font-size: 30px;
  font-weight: bold;
  color: #fff;
}
.nav {
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.nav .blog {
  text-decoration: none;
  font-size: 30px;
  font-weight: bold;
  color: #fff;
}
.nav .blog:hover {
  color: #6cf;
}
.app .avatar {
  width: 100px;
  border-radius: 50%;
}
</style>