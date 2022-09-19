<template>
  <div>
    <el-page-header @back="goBack" content="详情页面"> </el-page-header>
    <el-carousel :interval="4000" type="card" height="200px">
      <el-carousel-item v-for="item in images" :key="item.id">
        <h3 class="medium">
          <img class="img-size" :src="item.img" alt="轮播图片" />
        </h3>
      </el-carousel-item>
    </el-carousel>
    {{ msg }}页
    <el-container>
      <el-header style="text-align: right; font-size: 12px">
        <el-dropdown>
          <i class="el-icon-setting" style="margin-right: 15px"></i>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>查看</el-dropdown-item>
            <el-dropdown-item>新增</el-dropdown-item>
            <el-dropdown-item>删除</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
        <span>王小虎</span>
      </el-header>

      <el-main>
        <el-table :data="tableData">
          <el-table-column prop="date" label="日期" width="140">
          </el-table-column>
          <el-table-column prop="name" label="姓名" width="120">
          </el-table-column>
          <el-table-column prop="address" label="地址"> </el-table-column>
        </el-table>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "Home",

  data() {
    const item = {
      date: "2016-05-02",
      name: "王小虎",
      address: "上海市普陀区金沙江路 1518 弄",
    };
    return {
      msg: "home",
      tableData: Array(20).fill(item),
      images: [
        {
          id: 1,
          img: "../image/room.jpg",
        },
        {
          id: 2,
          img: "../image/wallhaven-9mjoy1_2560x1600.png",
        },
        {
          id: 3,
          img: "../image/wallhaven-k7v9yq.png",
        },
        {
          id: 4,
          img: "../image/wallhaven-rdl9vw.jpeg",
        },
      ],
    };
  },
  methods: {
    goBack() {
      console.log("go back");
    },
  },
};
</script>

<style scoped>
.img-size {
  width: 100%;
}
</style>