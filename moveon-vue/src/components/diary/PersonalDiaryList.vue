<template>
  <div>
    <el-row>
      <el-col>
        <el-button type="primary" size="small" @click="dialogFormVisible = true">填写日记</el-button>
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

    <el-dialog title="填写日记" :visible.sync = "dialogFormVisible">
      <el-form :model="diaryForm">
        <el-input type="text">请输入日记标题</el-input>
        <el-input type="text">请填写日记时间</el-input>
        <el-input type="text">请填写日记作者</el-input>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="dialogFormVisible = false">确认</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        dialogFormVisible: false,
        DiaryList: [
          {diaryTitle: 'a', diaryDate: 'a', diaryAuthor: 'a'}
        ],
        diaryForm: {}
      }
    },
    name: "PersonalDiaryList",
    mounted() {
      this.loadTable()
    },
    methods: {
      loadTable() {
        const that = this
        let gUserId = sessionStorage.getItem("globalUserId");
        this.$http.get('/diary/getUserDiary', {params: {userId: gUserId}})
          .then(res => {
            that.DiaryList = []
            that.DiaryList = res.data.data
            console.log(that.DiaryList)
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
