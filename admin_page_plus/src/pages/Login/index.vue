<template>
  <div class="container">
    <h2 class="title">login</h2>
    <label for="username" style="color: #6cf">用户名:</label>
    <input
      class="inp"
      v-model="user.username"
      type="text"
      name="username"
      autocomplete="off"
      id="username"
    />

    <div class="error" v-show="isShowUserErr" id="error-username">
      用户名不能为空
    </div>

    <br />
    <label for="password" style="color: #6cf">密&nbsp;&nbsp;&nbsp;码:</label>
    <input
      class="inp"
      v-model="user.password"
      type="password"
      name="password"
      id="password"
    />

    <div class="error" v-show="isShowPwdErr" id="error-password">
      密码不能为空
    </div>
    <br />
    <input
      class="btn"
      type="submit"
      @click="login"
      value="登录"
      id="loginBtn"
    />
  </div>
</template>

<script>
import { loginBlog } from "@/api";
export default {
  name: "Login",
  data() {
    return {
      isShowUserErr: false,
      isShowPwdErr: false,
      user: {
        username: "admin",
        password: "123123",
      },
    };
  },
  watch: {
    // 监听输入框
    user: {
      handler: function (newVal, oldVal) {
        //显示错误提示
        if (newVal.account === "") {
          this.isShowUserErr = true;
        } else {
          this.isShowUserErr = false;
        }
        if (newVal.password === "") {
          this.isShowPwdErr = true;
        } else {
          this.isShowPwdErr = false;
        }
      },
      deep: true,
    },
  },

  methods: {
    // 发送登录请求
    async login() {
      try {
        const res = await loginBlog(this.user);
        if (res.success) {
          this.$message.success("登录成功");
          //把token存到本地
          localStorage.setItem("token", res.data);
          //跳转到首页
          this.$router.replace("/home");
        } else {
          //弹出错误信息
          this.$message.error(res.errorMsg);
        }
      } catch (error) {
        //弹出错误信息--后端服务器报错
        // console.log(error);
        if (error.response.status === 500) {
          this.$message.error("服务器错误");
        }
      }
    },
  },
};
</script>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
}

.container .title {
  margin-bottom: 20px;
  color: #6cf;
  font-weight: 700;
  font-size: 30px;
}

.container .inp {
  width: 40vw;
  height: 5vw;
  border-radius: 5px;
  padding: 15px;
  border: 1px solid #6cf;
  color: #6cf;
  font-size: 20px;
  font-family: "Franklin Gothic Medium", "Arial Narrow", Arial, sans-serif;
}

.container .error {
  color: red;
  font-size: 14px;
}

.container .error2 {
  visibility: hidden;
  color: pink;
  font-size: 14px;
}

.container .btn {
  margin-top: 1.3333vw;
  width: 20vw;
  height: 5vw;
  border-radius: 5px;
  border: none;
  background-color: #6cf;
  color: white;
  font-weight: bold;
  font-size: 2.1333vw;
  cursor: pointer;
}
</style>