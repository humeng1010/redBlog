<template>
  <div class="blog-wrapper skill">
    <section class="mt-5 pb-5">
      <div class="container">
        <div class="row">
          <!-- 文章列表 -->
          <div class="col-12">
            <article class="blog-arc">
              <div class="blog-arc-detail">
                <h5 class="text-center mt-0 mb-3 pb-3">了解的技术栈</h5>
                <p v-for="(skill, index) in skills" :key="skill.id">
                  <strong>
                    {{ skill.skill }}
                  </strong>
                </p>
              </div>
            </article>
          </div>
          <!-- 内容 end -->
        </div>
      </div>
      <!-- end container -->
    </section>
  </div>
</template>

<script>
import { mapActions, mapState } from "vuex";
export default {
  mounted() {
    this.getUserSkill();
  },
  computed: {
    ...mapState("blogPage", ["skills"]),
  },
  methods: {
    ...mapActions("blogPage", ["getUserSkill"]),
  },
};
</script>

<style scoped>
.skill {
  height: 1000px;
}
</style>