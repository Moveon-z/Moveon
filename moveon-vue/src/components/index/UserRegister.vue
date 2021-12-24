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
  import api from "../../request/user/request";
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
        api.registerUser(this.form)
        .then(res => {
          if (res.type === 'success') {
            this.$message.info("注册成功!")
            this.$router.push({path: '/login'})
          }
        }).catch(err => {
          this.$message.error("注册失败" + err.message)
        })
        // this.$http.post('user/registerUser', {param: {user: this.form}})
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
