import axios from 'axios';
import React, { useEffect } from 'react'
import { useParams } from 'react-router-dom'

const SearchInput = () => {
   let{name}= useParams();//it helps to get the value from url

   let searchFunc=()=>{
       axios.get('https://fakestoreapi.com/products')
       .then((res)=>console.log(res.data))
       .catch((err)=>console.log(err));
   }
   //loading function in to dom with the help of useEffect
   useEffect(() => {
       searchFunc();
   }, [])

  return (
    <div>SearchInput...{name}</div>
  )
}

export default SearchInput