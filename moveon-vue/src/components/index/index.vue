<template>
  <div>
    <el-container>
      <el-main>
        <el-row :gutter="20">
          <el-col :span="8">
            <el-card shadow="hover" @click="hello">
              <div @click="goDiary">
                <span>个人日记</span>
              </div>
            </el-card>
          </el-col>
          <el-col :span="8">
            <el-card shadow="hover">
              <span>Moveon</span>
            </el-card>
          </el-col>
          <el-col :span="8">
            <el-card shadow="hover">
              <span>Moveon</span>
            </el-card>
          </el-col>
        </el-row>
      </el-main>
    </el-container>
  </div>
</template>

<script>
  export default {
    name: "index",
    data() {
      return{
        user: {
          name: ''
        },
      }
    },
    computed: {
      getName() {
        let item = sessionStorage.getItem('name');
        return item
      }
    },
    methods: {
      goDiary() {
        this.$router.push({path: '/personalDiary'})
      }
    }
  }
</script>

<style scoped>

  el-card {

  }
</style>
