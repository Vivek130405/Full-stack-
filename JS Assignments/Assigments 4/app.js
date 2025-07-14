// Assignment 1: Write a function that takes a name and returns a greeting message 
// using template literals.

const greet = (name) =>{
   return `Hello ${name}`;
}
console.log(greet("vivek"));

//  Assignment 2: Create a function isEven(num) that returns true if a number is even.

function isEven(num){
    if (num % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
console.log(isEven(8));

// Assignment 3: Use arrow functions to write three small math functions: add, 
// subtract, multiply

const add = (a,b) => a+b;
const sub = (a,b) => a-b;
const mult = (a,b) => a*b;
const div = (a,b) => a/b;