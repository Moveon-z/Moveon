<template>
  <div style="background: url('static/night01.jpg') center top no-repeat" class="fatherBox">
    <el-row>
      <div id="bigBox">
        <el-form class="login-form" ref="form" :model="form" label-width="80px">
          <div class="form-text">
            <h1>LOGIN</h1>
          </div>
          <div class="inputBox">
            <el-form-item label="用户名">
              <el-input v-model="form.username" class="inputTest"></el-input>
            </el-form-item>
            <el-form-item label="用户密码">
              <el-input type="password" v-model="form.password" class="inputTest"></el-input>
            </el-form-item>
          </div>
          <el-form-item>
            <el-button type="primary" @click="onSubmit" class="inputButton">登录</el-button>
            <el-button @click="goRegister">注册</el-button>
          </el-form-item>
        </el-form>
      </div>
    </el-row>
  </div>
</template>

<script>
  import api from '../../request/user/request';
  export default {
    data() {
      return {
        form: {
          username: '',
          password: ''
        }
      }
    },
    methods: {
      onSubmit() {
        api.getUser(this.form.username,this.form.password).then(res => {
          if (res.type === 'success') {
            this.$message.info("登录成功")
            sessionStorage.setItem("globalUserId", res.data.id)
            sessionStorage.setItem("name",res.data.name)
            this.$router.push({path: '/index'})
          }else {
            this.$message.error("用户名或密码错误,请重新输入！")
            return
          }
        })
        // this.$http.get('/user/getUser', {params: {username: this.form.username, password: this.form.password}})
        //   .then(res => {
        //     if (res.data.type === 'success') {
        //       sessionStorage.setItem("globalUserId", res.data.data.id)
        //       sessionStorage.setItem("name",res.data.data.name)
        //       this.$router.push({path: '/index'})
        //     }else {
        //       this.$message.error("用户名或密码错误,请重新输入！")
        //       return
        //     }
        //   })
      },
      goRegister() {
        this.$router.push({path: '/register'})
      }
    }
  }
</script>

<style scoped>
  .el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }

  /*body > .el-container {*/
  /*  margin-bottom: 40px;*/
  /*}*/



  /*.el-container:nth-child(5) .el-aside,*/
  /*.el-container:nth-child(6) .el-aside {*/
  /*  line-height: 260px;*/
  /*}*/

  /*.el-container:nth-child(7) .el-aside {*/
  /*  line-height: 320px;*/
  /*}*/

  /*.login-form {
    height: 300px;
    width: 280px;
    margin-left: 85%;
    margin-top: 10%;
    flex: auto;
    !*background-color: black;*!
  }

  .form-text {
    font-size: large;
    margin-left: 50%;
    padding-bottom: 10px;
  }

  .login-form .el-form-item {
  .login-form .el-form-item {
    margin-right: 15px;
  }*/

  #bigBox{
    margin: 250px auto 0;
    padding: 20px 50px;
    background-color: #00000090;
    width: 400px;
    height: 330px;
    border-radius: 10px;
    text-align: center;
  }

  #bigBox h1{
    color: white;
  }

  #bigBox .inputBox{
    margin-top: 50px;
  }

  #bigBox .inputBox .inputTest{
    width: 280px;
  }

  #bigBox .inputBox .inputTest input{
    border: 0;
    padding: 10px 10px;
    border-bottom: 1px solid white;
    background-color: #00000000;
    color: white;
  }

  /*#bigBox .inputBox .inputButton{
    border: 0;
    width: 150px;
    height: 25px;
    color: white;
    margin-top: 30px;
    border-radius: 20px;
    background-image: linear-gradient(to right, #b8cbb8 0%, #b8cbb8 0%, #b465da 0%, #cf6cc9 33%, #ee609c 66%, #ee609c 100%);
  }*/

  #register_btn{
    border: 0;
    width: 150px;
    height: 25px;
    color: white;
    margin-top: 30px;
    border-radius: 20px;
    background-image: linear-gradient(to top, #d9afd9 0%, #97d9e1 100%);
  }

  .fatherBox {
    width:100%;
    height:100%;
    position:fixed;
    background-size:100% 100%;
  }
</style>
