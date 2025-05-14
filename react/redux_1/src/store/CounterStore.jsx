import { createStore } from 'redux';
import CounterReducer from '../reducers/CounterReducer';
const store=createStore(CounterReducer);
export default store;

//npm install @reduxjs/toolkit
//instead of using createStore we can use configureStore from redux toolkit
// import { configureStore } from '@reduxjs/toolkit';
// import CounterReducer from '../reducers/CounterReducer';
// const store=configureStore({
//     reducer:CounterReducer
// });