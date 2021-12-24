import {get , post} from "../http";

export default {
  getAllUsers() {
    return get('user/getAllUsers')
  },
  getUser(username, password) {
    return get('user/getUser', {username: username, password: password})
  },
  registerUser(entity) {
    return post('user/registerUser', entity)
  }
}

