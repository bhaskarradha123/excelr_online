// //js object
// let obj1 = {
//   name: "John",
//   "age": 30,
//   "city": "New York",
// };
// //convert js object to json
// let json1 = JSON.stringify(obj1);

// console.log(obj1);
// console.log(json1);

// // convert json to js object
// let json2 = '{"name":"John","age":30,"city":"New York"}';
// let obj2 = JSON.parse(json2);
// console.log(json2);
// console.log(obj2);



const json1={
    "name": "John",
    "age": 30,
    "city": "New York"
}
console.log(JSON.stringify(json1));
const json_list=[1,2,3,4,5,6,7,8,9,10]
console.log(JSON.stringify(json_list));
const json_list2=[
    {"name": "John", "age": 30, "city": "New York"},    
    {"name": "John", "age": 30, "city": "New York"},    
];
console.log(JSON.stringify(json_list2));

const nested_object={
    "name": "John",
    "age": 30,
    "city": "New York",
    "skills": ["JavaScript", "Python", "Java"],
    "address": {
      "street": "123 Main St",
      "city": "Any town",
      "state": "CA"
    } 
  };
let nested_json=JSON.stringify(nested_object);
console.log(nested_json);

console.log(nested_object.name);
console.log(nested_object["age"]);


async function fetchData() {
    const response = await fetch('https://jsonplaceholder.typicode.com/users/1');
    const data = await response.json();
    console.log(data);
    console.log(data.name);
    console.log(data.company.name)
    console.log(data.address["street"]);
  }
  fetchData();



 