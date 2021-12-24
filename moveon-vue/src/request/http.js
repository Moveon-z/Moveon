import axios from "axios";
import qs from 'qs';
import da from "element-ui/src/locale/lang/da";

axios.defaults.baseURL = '/api/';
axios.defaults.timeout = 10000
// axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=UTF-8';

/*var instance = axios.create({
  // headers: {'content-type':'multipart/form-data'}
});*/

/*//http request 拦截器
axios.interceptors.request.use((config) => {
  if (config.method === 'post') {
    config.data = qs.stringify(config.data);
  }
  return config;
},(error) => {
  return Promise.reject(error);
});*/

export function get(url, params) {
  return new Promise((resolve, reject) => {
    axios.get(url, {
      params: params
    }).then(res => {
      resolve(res.data)
    }).catch(err => {
      reject(err.data)
    })
  })
}

export function post(url, params) {
  return new Promise((resolve, reject) => {
    axios.post(url, params)
      .then(res => {
        resolve(res.data)
      }).catch(err => {
        reject(err.data)
    })
  })
}

/*export function postForm(url,data = {}) {
  return new Promise((resolve, reject) => {
    instance.post(url,data)
      .then(res => {
        resolve(res.data);
      },err => {
        reject(err)
      })
  })
}*/
