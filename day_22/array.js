// let arr1=[1,2,3,4,5,6,'hello'];
// console.log(arr1);
// //arr1.splice(5);// removes all elements from index 5 to end of array
// // console.log(arr1);//[]
// // arr1.splice(4,2);// removes 2 element from index 4 to end of array
// // console.log(arr1);//[ 1, 2, 3, 4 ,'hello' ]
// // arr1.splice(2,0,'bye','hi')// adds 2 element at index 2
// // console.log(arr1);
// arr1.splice(2,2,'bye','hi')// removes 2 element from index 2 and adds 2 element at index 2
// console.log(arr1);


//some() method
 let arr1=[1,2,3,4,5,6,'hello'];
let output=arr1.some(
    (e)=>e%2==0//even numbers
)
console.log(output);//true

/*
 findIndex() method
 The findIndex() method returns the index of the 
 first element in the array that satisfies the 
 provided testing function. If no values satisfy the testing function,
-1 is returned.
syntax:
array.findIndex(callback(element[, index[, array]])[, thisArg])
*/
let arr2=[1,20,3,4,5,6,'hello'];
let output2=arr2.findIndex(
    (e)=>e%2==0//even numbers
)
console.log(output2);//1

/**
 * reverse() method
 * The reverse() method reverses the elements of an array in place.
 *     -it reverse the original array
 *     -it returns the reference to the same array, now modified.
 * 
 */
let arr3=[1,2,3,4,5,6,'hello'];
console.log(arr3);
let output3=arr3.reverse()
console.log(output3);
console.log(arr3);//[ 'hello', 6, 5, 4, 3, 2, 1 ]

/**
 * toString() method
 *      * The toString() method returns a string representing the
 *           specified array and its elements.
 *      * The toString() method does not change the original array.
 *      * returns string with comma separated values.
 */
let arr4=[10,20,30];
let output4=arr4.toString();
console.log(arr4);//[ 10, 20, 30 ]
console.log(output4);//10,20,30
console.log(typeof output4);//string

let arr5=['hello','world','hi'];
let output5=arr5.toString();
console.log(arr5);//[ 'hello', 'world', 'hi' ]
console.log(output5);//hello,world,hi

/**
 * join() method
 * The join() method creates and returns a new string by
 *     concatenating all of the elements in an array (or an array-like object),
 *     separated by commas or a specified separator string.
 *  * The join() method does not change the original array.
 *  * The join() method returns a string.
 */

let arr6=[10,20,30];
let output6=arr6.join('-😊');
console.log(output6);

/**
 * slice() method
 *  -The slice() method returns a shallow copy of a
 *  portion of an array into a new array object selected
 *  from start to end (end not included) where start and
 *  end represent the index of items in that array.
 *  -The original array will not be modified.
 * syntax:
 * array.slice(start, end)
 *  start: it is used to specify the starting index
 *  end: it is used to specify the ending index(exclusive)(optional)
 * 
 */
let arr7=[10,20,30,40,50,60];
let output7=arr7.slice(2,4);//[30,40]
console.log(output7);//[ 30, 40 ]
console.log(arr7.slice(3));//[ 40, 50, 60 ]

/**
 * forEach() method
 *    -The forEach() method executes a provided function once
 *    for each array element.
 *    -it works like looping through the array elements.
 *    -The forEach() method does not return a value.
 *syntax:
        arr.forEach(
            (currentValue, index, array) => {
                // code block
            }
 */

let arr8=[10,20,30,40,50,60];
arr8.forEach(
    (element,index,array)=>{
        console.log(`element: ${element} `);
        console.log('square of element:',element*element);
        
    }
)

/**
 * for of loop
 *    -The for...of statement creates a loop iterating over
 *    iterable objects, including: typed sets, arrays, strings, etc.
 *  syntax:
 *    for(let element of array){
 * *      //code block
 *    } 
 *  
 */
let arr9=[10,20,30,40,50,60];
        for(let element of arr9){
            console.log(element);    
        }

        for(let index in arr9){
            console.log(index,' - ',arr9[index]);
            
        }


/**
 * indexOf() method
 *     -  The indexOf() method returns the first index at
 *         which a given element can be found in the array,
 *         or -1 if it is not present.
 * syntax:
 * array.indexOf(searchElement, fromIndex)
 * searchElement: The value to search for.
 * fromIndex: The index at which to begin the search.(default is 0)(optional)
 */

let arr10=[10,20,30,40,50,60];
let output10=arr10.indexOf(20);//1
console.log(arr10.indexOf(100));//-1
console.log(arr10.indexOf(100,0));//-1


/**
 * delete
 *    - The delete operator removes a property from an object/array.
 *    - it deletes the value but not the key/index position
 *    - it returns true if the property is deleted, otherwise false
 */
let arr11=[10,20,30,40,50,60];
delete arr11[1];
console.log(arr11);//[ 10, <1 empty item>, 30, 40, 50, 60 ]

