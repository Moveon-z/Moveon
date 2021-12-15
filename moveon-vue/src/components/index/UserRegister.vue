<template>
  <div id="bigBox" style="background: url('static/night01.jpg') center center no-repeat">
    <el-form class="m_form" ref="form" :model="form" label-width="80px">
      <el-form-item label="用户名">
        <el-input v-model="form.username"></el-input>
      </el-form-item>
      <el-form-item label="用户密码">
        <el-input type="password" v-model="form.password"></el-input>
      </el-form-item>
      <el-form-item label="昵称">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="E-mail">
        <el-input v-model="form.email"></el-input>
      </el-form-item>
      <el-form-item label="手机号码">
        <el-input v-model="form.phone"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="registerUser">注册</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  export default {
    name: "UserRegister",
    data() {
      return {
        form: {
          username: '',
          password: '',
          name: '',
          email: '',
          phone: ''
        }
      }
    },
    methods: {
      registerUser() {
        this.$http.post('/user/registerUser',this.form)
          .then(res=>{
            console.log(res)
          })
      }
    }
  }
</script>

<style scoped>
  #bigBox {
    background-size: 100% 100%;
    height: 100%;
  }

  .m_form {
    max-width: 380px;
    margin: 0 auto;
  }

  .html {
    height: 100%;
    width: 100%;
    position: fixed;
  }

  body {
    width: 100%;
    height: 100%;
    text-align: center;
    margin: 0;
  }
</style>
