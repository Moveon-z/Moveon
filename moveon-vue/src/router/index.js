import Vue from 'vue'
import Router from 'vue-router'
import TopComponent from "../components/index/TopComponent";
import UserLogin from "../components/index/UserLogin";
import UserRegister from "../components/index/UserRegister";
import index from "../components/index/index";

//PersonalDiary 个人日记
import PersonalDiaryList from "../components/diary/PersonalDiaryList";

Vue.use(Router)
Vue.component('TopComponent',TopComponent);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'UserLogin',
      component: UserLogin
    },
    {
      path: '/login',
      name: 'UserLogin',
      component: UserLogin
    },
    {
      path: '/register',
      name: 'UserRegister',
      component: UserRegister
    },
    {
      path: '/index',
      name: 'index',
      component: index,
      meta: {
        keepAlive: true
      }
    },
    {
      path: '/personalDiary',
      name: 'PersonalDiaryList',
      component: PersonalDiaryList,
      meta: {
        keepAlive: true
      }
    },
  ]
})
