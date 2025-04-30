import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import Header from './components/Header.jsx'
import Footer from './components/Footer.jsx'
import Example1 from './states/Example1.jsx'
import Example2 from './states/Example2.jsx'
import Example3 from './states/Example3.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
   {/* <Header/>
   <Footer/> */}
   {/* <Example1/> */}
   {/* <Example2/> */}
   <Example3/>
  </StrictMode>,
)
