/* Assignment 1: Declare at least 5 different variables (e.g., name, age, 
isStudent, etc.), log each variable's value, and its type using typeof. Add 
comments to explain what you expect from typeof */

let studentName = 'Vivek';
let studentRollNo = 340;
let enrollmentStatus = true;
let age = 20;
let departmentName = 'Computer Engg.';
let internshipStatus = null;
let studentEmail;

console.log("Student Name :", studentName);
console.log("Student rollNo :", studentRollNo);
console.log("Student Enrollment Status :", enrollmentStatus);
console.log("Student age :", age);
console.log("Department Name :", departmentName);
console.log("Internship Status :", internshipStatus);
console.log("Student Email :" + studentEmail);

/* I expect that typeof studentName will return "string",
typeof studentRollNo will return "number",
typeof enrollmentStatus will return "boolean",
typeof age will return "number",
typeof departmentName will return "string", 
typeof internshipStatus will return "object",
and typeof studentEmail will return "undefined". */

console.log("Student Name :", typeof studentName);
console.log("Student rollNo :", typeof studentRollNo);
console.log("Student Enrollment Status :", typeof enrollmentStatus);
console.log("Student age :", typeof age);
console.log("Department Name :", typeof departmentName);
console.log("Internship Status :", typeof internshipStatus);
console.log("Student Email :", typeof studentEmail);

/* OUTPUT
Student Name : Vivek
app.js:14 Student rollNo : 340
app.js:15 Student Enrollment Status : true
app.js:16 Student age : 20
app.js:17 Department Name : Computer Engg.
app.js:18 Internship Status : null
app.js:19 Student Email :undefined
app.js:29 Student Name : string
app.js:30 Student rollNo : number
app.js:31 Student Enrollment Status : boolean
app.js:32 Student age : number
app.js:33 Department Name : string
app.js:34 Internship Status : object
app.js:35 Student Email : undefined */

/* Assignment 2: Create a string variable that contains your favorite quote. 
Use console.log to display the quote and use typeof to verify it's a string */

let quote = "In a world where you can be anything, be kind — because kindness is a language the deaf can hear and the blind can see."
console.log("My Fav :", quote);
console.log("My Fav :", typeof quote)

/* OUTPUT
app.js:57 My Fav : In a world where you can be anything, be kind — because kindness is a language the deaf can hear and the blind can see.
app.js:58 My Fav : string */