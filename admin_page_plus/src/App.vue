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
  mounted() {},
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
  overflow: hidden;
  height: 100%;
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
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
