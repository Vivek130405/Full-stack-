greek();
// greekof();
function greek(){
    console.log("Hello world")
}
greek();
var greekof = function(){
    console.log("Good, Morning!!!")
}
greekof();

function subtract(value1,value2){
    console.log(value1-value2);
}
function sum(value1,value2){
    console.log(value1+value2);
    return value1+value2;
}
function mult(value1,value2){
    console.log(value1*value2);
}
function divison(value1,value2){
    console.log(value1/value2);
}

subtract(10,7);
sum(10,7);
mult(10,7);
divison(10,7);

const msg = (val1,val2) => val1+val2;
console.log(msg(1,2));
const msg1 = (val1,val2) =>{
    return val1+val2;
} 
console.log(msg1(2,4));

function square(num){
    return num * num;
}
console.log(square(9));

var greet = (name) =>{
    return "hello " + name;
}
console.log(greet("Vivek"));

//  Activity 1:
//  Write a function square(num) that returns the square of a number

const ssquare = (a) => a*a;
console.log(ssquare(9));

//  2. Convert this regular function to an arrow function

const greett = (name) => "Hello" + name;
console.log(greett("Vivek"))