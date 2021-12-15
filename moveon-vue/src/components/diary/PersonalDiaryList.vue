<template>
  <div>
    <el-table :data="DiaryList">
      <el-table-column prop="diaryTime" label="日记日期"></el-table-column>
      <el-table-column prop="diaryText" label="内容"></el-table-column>
      <template slot-scope="scope">
        <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
        <el-button type="text" size="small">编辑</el-button>
      </template>
    </el-table>
  </div>
</template>

<script>
  export default {
    name: "PersonalDiaryList",
    data: {
      DiaryList: {}
    },
    methods: {
      handleClick() {
        
      }
    }
  }
</script>

<style scoped>

</style>
