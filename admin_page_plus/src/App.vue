<template>
  <div id="app">
    <AdminHeader v-show="$route.meta.show"></AdminHeader>
    <left v-show="$route.meta.show"></left>
    <router-view></router-view>
  </div>
</template>

<script>
import AdminHeader from "@/components/AdminHeader.vue";
import Left from "@/components/Left.vue";
export default {
  name: "App",
  components: {
    Left,
    AdminHeader,
  },
  mounted() {
    console.dir(this.$route);
  },
};
</script>

<style>
</style>
