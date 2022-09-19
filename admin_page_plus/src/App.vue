<template>
  <div id="app">
    <left v-show="$route.meta.show"></left>
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
  flex-wrap: wrap;
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
</style>
