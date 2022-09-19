<template>
  <div>
    登陆页面
    <input type="text" v-model="user.account" name="" id="" />
    <input type="password" v-model="user.password" name="" id="" />
    <button @click="login">登陆</button>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      user: {
        account: "admin",
        password: "123456",
      },
    };
  },
  methods: {
    login() {
      if (this.user.account === "admin" && this.user.password === "123456") {
        this.$router.push("/home");
        this.$message.success("登陆成功");
      } else {
        this.$message.error("账号或密码错误");
      }
    },
  },
};
</script>

<style>
</style>