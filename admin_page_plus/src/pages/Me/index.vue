<template>
  <div class="me">

<el-dialog title="个人信息" :visible.sync="dialogFormVisible">

  <el-form :model="form">
    <el-form-item label="个人昵称" :label-width="formLabelWidth">
      <el-input v-model="form.userNickname" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item label="邮箱" :label-width="formLabelWidth">
      <el-input v-model="form.userEmail" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item label="头像" :label-width="formLabelWidth">
      <el-input v-model="form.userAvatar" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item label="生日" :label-width="formLabelWidth">
      <el-input v-model="form.userBirthday" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item label="个性签名" :label-width="formLabelWidth">
      <el-input v-model="form.userSignature" autocomplete="off"></el-input>
    </el-form-item>

    <!-- <el-form-item label="活动区域" :label-width="formLabelWidth">
      <el-select v-model="form.region" placeholder="请选择活动区域">
        <el-option label="区域一" value="shanghai"></el-option>
        <el-option label="区域二" value="beijing"></el-option>
      </el-select>
    </el-form-item> -->
  </el-form>

  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="dialogFormVisible = false; updateUserInfos()">确 定</el-button>
  </div>
</el-dialog>


    <div class="user_info">
      <div class="userNickname">
        {{ userInfo.userNickname }} <span>您好</span>
      </div>
      <!-- 修改按钮 -->
      <el-button
        type="primary"
        size="mini"
        round
        @click="dialogFormVisible = true"
        >修改个人信息</el-button
      >
      
      <div class="userAvatar">
        <img :src="userInfo.userAvatar" alt="" />
      </div>
      <div class="userName">
        <span>用户名：</span>
        <span>{{ userInfo.userName }}</span>
      </div>
      <div class="userEmail">
        <span>邮箱：</span>
        <span>{{ userInfo.userEmail }}</span>
      </div>
      <div class="userBirthday">
        <span>生日：</span>
        <span>{{ userInfo.userBirthday }}</span>
      </div>
      <div class="userAge">
        <span>年龄：</span>
        <span>{{ userAge }}</span>
      </div>

      <div class="userSignature">
        <span>个性签名：</span>
        <span>{{ userInfo.userSignature }}</span>
      </div>
      </div>
    </div>
  </div>
</template>

<script>
import { userInfo, updateUserInfo, updatePassword } from "@/api";
export default {
  data() {
    return {
      dialogFormVisible: false,
      form: {
        userId: "",
        userName: "",
        userEmail: "",
        userAvatar: "",
        userBirthday: "",
        userAge: "",
        userNickname: "",
        userSignature: "",
      },
      formLabelWidth: "120px",
      userInfo: {
        userId: "",
        userName: "",
        userEmail: "",
        userAvatar: "",
        userBirthday: "",
        userAge: "",
        userNickname: "",
        userSignature: "",
      },
    };
  },
  computed: {
    userAge() {
      //计算年龄
      let birthday = new Date(this.userInfo.userBirthday);
      let now = new Date();
      let age = now.getFullYear() - birthday.getFullYear();
      if (
        now.getMonth() < birthday.getMonth() ||
        (now.getMonth() == birthday.getMonth() &&
          now.getDate() < birthday.getDate())
      ) {
        age--;
      }
      return age;
    },
  },
  mounted() {
    this.getUserInfo();
    this.$nextTick(() => {
      this.form = this.userInfo;
    });
  },
  methods: {
    async getUserInfo() {
      try {
        const res = await userInfo();
        // console.log(res);
        if (res.success) {
          this.userInfo = res.data;
          return;
        }
        this.$message.error(res.errorMsg);
      } catch (error) {
        this.$message.error(error);
      }
    },
    async updateUserInfos() {
      try {
        this.form.userId = this.userInfo.userId;
        const res = await updateUserInfo(this.form);
        // console.log(res);
        if (res.success) {
          this.$message.success("修改成功");
          return;
        }
        this.$message.error(res.errorMsg);
      } catch (error) {
        this.$message.error(error);
      }
    },

    async updatePassword() {
      try {
        const res = await updatePassword(this.userInfo);
        // console.log(res);
        if (res.success) {
          this.$message.success("修改成功");
          return;
        }
        this.$message.error(res.errorMsg);
      } catch (error) {
        this.$message.error(error);
      }
    },
  },
};
</script>

<style scoped>
.me {
  flex: 8;
  height: 100%;
  overflow: auto;
  /* background-color: #fff; */
}

.user_info {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  margin-top: 50px;
  position: relative;
}

.userNickname {
  font-size: 20px;
  font-weight: bold;
  margin: 20px 0;
  text-align: center;
}
.userName,
.userEmail,
.userBirthday,
.userAge,
.userAvatar,
.userSignature {
  margin: 10px 0;
  font-size: 16px;
  /* 鼠标变小手 */
  cursor: pointer;
}
.userName:hover,
.userEmail:hover,
.userBirthday:hover,
.userAge:hover,
.userAvatar:hover,
.userSignature:hover {
  color: #1890ff;
}

.userAvatar img {
  width: 100px;
  height: 100px;
  border-radius: 50%;
}
</style>