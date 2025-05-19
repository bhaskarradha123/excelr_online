import usersReducer from '../users/UsersSlice'
import { configureStore } from '@reduxjs/toolkit'
let store=configureStore({
    reducer:{
        users:usersReducer
    }
})
export default store
