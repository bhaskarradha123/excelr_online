// accessing element with getElementById()

let heading=document.getElementById('heading');
heading.style.color='red';
console.log(heading);


//accessing element with getElementsByClassName()
let heading2=document.getElementsByClassName('heading2');
for(let e of heading2){
    e.style.color='green';
}

console.log(heading2);