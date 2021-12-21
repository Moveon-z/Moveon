<template>
  <div :onload="init()">
    <el-row>
      <el-col>
        <el-button type="primary" size="small" @click="writeDiary()">填写日记</el-button>
      </el-col>
    </el-row>
    <el-table :data="DiaryList">
      <el-table-column prop="diaryTitle" label="日记标题"></el-table-column>
      <el-table-column prop="diaryDate" label="日记时间"></el-table-column>
      <el-table-column prop="diaryAuthor" label="日记作者"></el-table-column>
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
      DiaryList: [],
    },
    methods: {
      init() {
        console.log("a")
        let gUserId = sessionStorage.getItem("globalUserId");
        this.$http.get('/diary/getUserDiary', {params: {userId: gUserId}})
          .then(res => {
            this.DiaryList.push(res.data.data)
            console.log(res.data)
          })
      },
      writeDiary() {

      },
      handleClick() {

      }
    }
  }
</script>

<style scoped>

</style>
