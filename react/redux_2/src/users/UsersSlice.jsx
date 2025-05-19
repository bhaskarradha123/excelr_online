import { createAsyncThunk } from "@reduxjs/toolkit";



//promises- pending, fulfilled, rejected


//  export const fetchUsers=async(dispatch)=>{
//     dispatch({type:'fetch_start'})
//     try{
//         const response=await fetch('https://jsonplaceholder.typicode.com/users')
//         const userdata=await response.json()
//         dispatch({type:'fetch_success',payload:userdata})
//     }
//     catch(error){
//         dispatch({type:'fetch_error',payload:error.message})
//     }
//  }


//createAsyncThunk is a function that creates an action creator for async actions
// It takes two arguments: a string action type and a function that returns a promise



export const fetchUsers = createAsyncThunk('users/fetchUsers', async () => {
    const response = await fetch('https://jsonplaceholder.typicode.com/users');
    if (!response.ok) {
        throw new Error('Network response was not ok');
    }
    const data = await response.json();
    return data;
}
     
)