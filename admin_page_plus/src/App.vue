<template>
  <div id="app">
    <AdminHeader></AdminHeader>
    <left></left>
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
};
</script>

<style>
</style>
