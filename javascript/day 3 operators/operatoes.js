//Arithmatic operators
let a = 10;
let b = 3;

console.log("Arithmetic Operators:");
console.log("a + b =", a + b);
console.log("a - b =", a - b);
console.log("a * b =", a * b);
console.log("a / b =", a / b);
console.log("a % b =", a % b);
console.log("a ** b =", a ** b);
console.log("a++ =", a++);
console.log("After a++, a =", a);
console.log("++b =", ++b);

//Assignment operator
let x = 5;

console.log("\nAssignment Operators:");
x += 2;
console.log("x += 2 ->", x);
x -= 1;
console.log("x -= 1 ->", x);
x *= 3;
console.log("x *= 3 ->", x);
x /= 2;
console.log("x /= 2 ->", x);
x %= 4;
console.log("x %= 4 ->", x);


//comparison operators
let num1 = 5;
let num2 = '5';

//Its only check values in this case its give true beacuse 
//its convert num1 in string and the match like this '5' == '5'
console.log('a == b',num1==num2);

//Its check data type too so in this case its give false
//because 5 === '5'
console.log('a === b',num1===num2);

//false
console.log('a != b',num1 != num2);

//true
console.log('a !== b',a !== b);

// others comparison operators are >,<,>=,<=

//logical operators

console.log(true && true);
console.log(true && false);
console.log(false && false);

console.log(true || true);
console.log(true || false);
console.log(false || false);

//! - its act like negation
console.log(!(true && true));
console.log(!(true && false));
console.log(!(false && false));

//In-class activity
//First
console.log(`The price of Apple iphone is ${'$1200'}`);

//Second 
console.log(!(20-5==15 && 30-15==15));


