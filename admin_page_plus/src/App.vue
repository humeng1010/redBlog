<template>
  <div id="app">
    <left v-if="$route.meta.show"></left>
    <router-view></router-view>
  </div>
</template>

<script>
import Left from "@/components/Left.vue";
export default {
  name: "App",
  components: {
    Left,
  },
  mounted() {
    console.dir(this.$route);
  },
};
</script>

<style>
body,
html {
  width: 100%;
  height: 100%;
}
#app {
  display: flex;
  height: 100%;
}

/* ===重设样式=== */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
a {
  color: #333;
  text-decoration: none;
}
li {
  list-style: none;
}
body {
  font-family: "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB",
    "Microsoft YaHei", "微软雅黑", Arial, sans-serif;
}
input:focus {
  outline: none;
}
</style>
