let arr1=[10,20,30,40,50]

console.log(arr1);

let arr2=['hlo','world','this','is','array']
console.log(arr2);
console.log(arr2[0]);
console.log(arr2[1]);
console.log(arr1.length);//5
//creating array using new keyword
let arr3=new Array(10,20,30,40,50);
console.log(arr3);

let arr4=new Array(3);//[_,_,_]
console.log(arr4);//[empty × 3]
console.log(arr4.length);//3


let arr5=new Array(1);//[_]
arr5[0]=10;
console.log(arr5);//[10]//array containing

let arr6=Array.of('developer');
console.log(arr6);//developer

//accessing array values/elements/items
let arr7=[10,20,30,40,50];
console.log(arr7[0]);// with the help of index
arr7[1]=10000;//updating the value of index 1
console.log(arr7[1]);//10000
arr7[1]=20000;//updating the value of index 2
console.log(arr7[1]);//20000








