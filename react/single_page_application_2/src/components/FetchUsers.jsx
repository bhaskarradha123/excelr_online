import React, { useEffect } from 'react'

const FetchUsers = () => {

    useEffect(
        () => {
            fetch('https://dummyjson.com/users')
            // fetch('https://reqres.in/api/users?page=1')
            .then(res => res.json())
            .then(data => console.log(data))
            .catch(err => console.log(err))
        },
        []
    )
  return (
    <div>FetchUsers</div>
  )
}

export default FetchUsers