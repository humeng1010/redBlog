<template>
  <div class="right">
    <div class="header">123</div>
    首页放博客列表，按照观看数降序排列，结合ECharts做数据化
    <div style="width: 500px; height: 500px" ref="chart"></div>
  </div>
</template>

<script>
export default {
  name: "Home",

  data() {
    return {};
  },
  mounted() {
    this.initCharts();
  },
  methods: {
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
  },
};
</script>

<style scoped>
.right {
  flex: 8;
}
.right .header {
  width: 100%;
  background-color: pink;
}
</style>