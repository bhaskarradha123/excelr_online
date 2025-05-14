
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import{useDispatch, useSelector} from 'react-redux'
import { decrement, increment } from './actions/CounterAction';
function App() {
  const dispatch=useDispatch();
   const count=useSelector((state)=>state.count);
  return (
    <>
     <div>{count}</div>
      <button onClick={()=>dispatch(increment())} className='btn btn-outline-success'>+</button>
      {/* <button onClick={()=>dispatch({type:'INCREMENT'})} className='btn btn-outline-success'>+</button> */}
      {" "}
      <button onClick={()=>dispatch(decrement())} className='btn btn-outline-danger'>-</button>
    </>
  )
}

export default App
