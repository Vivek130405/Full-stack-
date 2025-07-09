//Q 1 create h2 headings in HTML and Like "Apna college" and appeded this with "From vivek patil"
let h2 = document.querySelector("h2");
let inertext = h2.innerText;
h2.innerText = inertext + " From Vivek Patil";

//Q 2 create  three div with same class Name ".box" Access them and add some unique text to them
let divs = document.querySelectorAll(".box");
divs[0].innerText = "Vivek Patil";
divs[1].innerText = "Rahul Kure";
divs[2].innerText = "Raj Patil";

//Q 3 create a new button element. give its text to click me bg red and color white
let btn = document.createElement("button");
btn.innerText = "Click me";
btn.style.backgroundColor = "red";
btn.style.color = "white";
divs[0].after(btn);

// Q 4 Create a <p> tag in HTML, give it a class & some styling.
// Now create a new class in CSS and try to append this class to the <p> element.
// Did you notice, how you overwrite the class name when you add a new one?
// Solve this problem using classList.

let para = document.createElement("p");
para.innerText = "Hello My name is Vivek"
para.classList.add = "viv";
console.log(para);
divs[2].after(para);