// ✅ 1. Object Literal
const obj1 = {
  name: "Vivek",
  age: 22
};
console.log("Object Literal:", obj1);


// ✅ 2. Using new Object()
const obj2 = new Object();
obj2.name = "Vivek";
obj2.age = 22;
console.log("new Object():", obj2);


// ✅ 3. Constructor Function
function Person(name, age) {
  this.name = name;
  this.age = age;
}
const obj3 = new Person("Vivek", 22);
console.log("Constructor Function:", obj3);


// ✅ 4. Object.create()
const baseObj = {
  greet() {
    return "Hello from base";
  }
};
const obj4 = Object.create(baseObj);
obj4.name = "Vivek";
console.log("Object.create():", obj4);
console.log("Inherited Method:", obj4.greet());


// ✅ 5. ES6 Class
class PersonClass {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
}
const obj5 = new PersonClass("Vivek", 22);
console.log("ES6 Class:", obj5);


// 💡 Activity 1:
//  Create an object book with title, author, and year fields. Log author.

const book = {
  title : "Maharaja",
  author : "Vivek",
  year : 2031
};
console.log(book.author);

// 💡 Activity 2:
//  Add a nested object publisher with name and city. Access the city.

const book1 = {
  title : "Maharaja",
  author : "Vivek",
  year : 2031,
  publisher : {
    name : "Kacha",
    city : "pimplegaon"
  }
};
console.log(book1.publisher.city);

let jsonob = JSON.stringify(book1);
console.log(jsonob);