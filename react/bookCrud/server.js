//import modules
const express=require('express');
const mongoose=require('mongoose');
const cors=require('cors');
const dotenv=require('dotenv');

dotenv.config();
const app=express();
const PORT=process.env.PORT || 5000;
app.use(cors());
app.use(express.json());

mongoose.connect(process.env.MONGO_URL,{
    useNewUrlParser:true,
    useUnifiedTopology:true
}).
then(()=>{
    console.log('MongoDB connected');
    app.listen(PORT, ()=>{console.log(`Server is running on port ${PORT}`)});
    })
.catch((err)=>{
    console.log(err);
});

