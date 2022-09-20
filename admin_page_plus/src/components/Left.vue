<template>
  <div class="left">
    <div class="nav">
      <div class="user-info">
        <img class="avatar" src="../image/avatar.png" alt="" />
        <div class="username">
          <el-button type="primary" size="mini" round>root 管理员</el-button>
        </div>
      </div>
      <router-link class="home common" to="/home">
        <i class="el-icon-s-home"></i>
        首页
      </router-link>
      <router-link class="common" to="/blog">
        <i class="el-icon-edit"></i>
        管理博客
      </router-link>
      <router-link class="common" to="/home">
        <i class="el-icon-s-home"></i>
        个人中心
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: "Left",
  props: [],
  data() {
    const iterm = "左侧侧边栏";
    return {
      leftData: Array(20).fill(iterm),
    };
  },
  methods: {},
};
</script>

<style scoped>
.left {
  flex: 2;
  height: 100%;
  /* overflow: auto; */
  /* width: 250px; */
  /* background-color: #eee; */
  background: url("../image/room.jpg") center;
  background-size: auto 100%;
}
.left .nav {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 70%;
  text-align: center;
}
.nav .user-info .avatar {
  width: 100px;
  border-radius: 50%;
}

.nav .common {
  margin-top: 8px;
  width: 80%;
  height: 80px;
  font-size: 26px;
  line-height: 80px;
  background-color: #ccc;
  border-radius: 30%;
}
.nav .common:hover {
  background-color: skyblue;
}
.nav .common:focus {
  background-color: skyblue;
}
.nav .home {
  margin-top: 100px;
}
</style>
