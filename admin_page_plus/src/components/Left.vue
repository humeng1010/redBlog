<template>
  <div class="left">
    <div class="nav">
      <div class="avatar">
        <img class="avatar" src="../image/avatar.png" alt="" />
      </div>
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
  height: 100%;
  overflow: auto;
  width: 250px;
  background-color: #ccc;
}
.left .nav {
  margin: 20px;
}
.avatar {
  width: 100px;
  border-radius: 50%;
}
</style>
