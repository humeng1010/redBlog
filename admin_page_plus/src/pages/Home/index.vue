<template>
  <div class="right">
    <div class="header">博客列表</div>
    <!-- 首页放博客列表，按照观看数降序排列，结合ECharts做数据化 -->
    <div class="e-chart" ref="chart"></div>

    <el-table :data="tableData" stripe style="width: 100%">
      <el-table-column prop="blogTitle" label="标题" width="180">
      </el-table-column>
      <el-table-column prop="blogDescription" label="描述" width="180">
      </el-table-column>
      <el-table-column prop="blogViews" label="浏览量" sortable>
      </el-table-column>
      <el-table-column prop="blogLikeCount" label="点赞"> </el-table-column>
      <el-table-column prop="updateTime" label="更新时间"> </el-table-column>
    </el-table>
  </div>
</template>

<script>
import { getBlogList } from "@/api";
export default {
  name: "Home",

  data() {
    return {
      tableData: [],
    };
  },
  mounted() {
    this.initCharts();
    this.getBlogs();
  },
  methods: {
    async getBlogs() {
      try {
        const res = await getBlogList();
        if (res.success) {
          this.tableData = res.data;
        } else {
          this.$message.error(res.errorMsg);
        }
      } catch (error) {
        //弹出错误信息
        this.$message.error(error.response.data.errorMsg);
      }
    },
    initCharts() {
      let myChart = this.$echarts.init(this.$refs.chart);
      // console.log(this.$refs.chart);
      // 绘制图表
      myChart.setOption({
        title: { text: "博客访问量" },
        tooltip: {},
        xAxis: {
          type: "category",
          data: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
        },
        yAxis: {
          type: "value",
        },
        series: [
          {
            data: [820, 932, 901, 934, 1290, 1330, 1320],
            type: "line",
            smooth: true,
          },
        ],
      });
    },
    sort() {
      this.tableData.sort((a, b) => {
        return b.blogViews - a.blogViews;
      });
    },
  },
};
</script>

<style scoped>
.right {
  flex: 8;
  overflow: auto;
}
.e-chart {
  width: 500px;
  height: 500px;
  margin: 0 auto;
}
.right .header {
  width: 100%;
  height: 50px;
  line-height: 50px;
  text-align: center;
  font-size: 20px;
  font-weight: 700;
  color: #6cf;
}
</style>