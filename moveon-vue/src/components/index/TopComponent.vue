<template>
  <div>
    <el-container>
      <el-header>
        <el-row>
          <el-col :span="2">
            <div class="grid-content bg-purple">
              <i class="el-icon-sunny"></i>
            </div>
          </el-col>
          <el-col :span="20">
            <div class="grid-content bg-purple">
              hello
            </div>
          </el-col>
          <el-col :span="2">
            <div class="grid-content bg-purple">
              <el-menu :default-active="1" class="el-menu-demo" mode="horizontal" >
                <el-submenu index="2">
                  <template slot="title">个人中心</template>
                  <el-menu-item index="2-1">个人中心</el-menu-item>
                  <el-menu-item index="2-2">退出</el-menu-item>
                </el-submenu>
              </el-menu>
            </div>
          </el-col>
        </el-row>
      </el-header>
    </el-container>
  </div>
</template>

<script>
  export default {
    name: "TopComponent"
  }
</script>

<style scoped>

</style>
