<template>
  <div class="footer">
    <ul class="myInfo">
      <li>联系方式:</li>
      <li>微信:</li>
      <li>邮箱:</li>
    </ul>
    <ul class="myInfo">
      <li>一些待补充的信息</li>
      <li>some</li>
      <li>information</li>
    </ul>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.footer {
  width: 100%;
  height: 300px;
  /* 不支持渐变默认颜色 */
  background-color: #6cf;
  background-image: linear-gradient(rgb(255, 234, 236), #6cf);
}
.footer .myInfo {
  float: right;
  margin-right: 10vmin;
  margin-top: 10vmin;
}
</style>