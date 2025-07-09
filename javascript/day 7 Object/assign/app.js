// Assignment 1: Create an object student with at least 4 properties. Print each using 
// both dot and bracket notation

const student = {
    roll_no : 2,
    name : "Vivek",
    address : "Pachora",
    num : 7586190981
};
console.log(student.roll_no);
console.log(student.name);
console.log(student.address);
console.log(student.num);
console.log(student["roll_no"]);
console.log(student["name"]);
console.log(student["address"]);
console.log(student["num"]);

//  Assignment 2: Add a method to the object that prints a greeting using the student’s 
// name

let studentt = {
    name: "Vivek",
    age: 21,
    grade: "A",
    city: "Pune",

    greet: function() {
        console.log("Hello, my name is " + this.name);
    }
};

studentt.greet();


//  Assignment 3: Create an array of multiple student objects and convert the array to 
// JSON using JSON.stringify()

let student1 = {
    name: "Vivek",
    age: 21,
    grade: "A",
    city: "Pune"
};

let student2 = {
    name: "Sneha",
    age: 22,
    grade: "B",
    city: "Mumbai"
};

let student3 = {
    name: "Mohit",
    age: 20,
    grade: "A+",
    city: "Delhi"
};


let studentsArray = [student1, student2, student3];


let jsonString = JSON.stringify(studentsArray);


console.log(jsonString);