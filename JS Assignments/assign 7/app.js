//  1. Create a <div> with text and append it to the body using JavaScript.
let div = document.createElement("div");
div.innerText = "Hello My name is Vivek";
div.style.backgroundColor ="pink";
div.style.height = "100px";
div.style.width = "100px";
let body = document.body;
body.append(div);

//2. Remove a specific element from the DOM using its ID.
let p = document.getElementById("jk");
p.remove();

//3. Create a <ul> with 5 <li> items using a loop and add it to the page.
let ul = document.createElement("ul");
for(let i = 1;i<=5;i++){
    let li = document.createElement("li");
    li.innerText = "Vivek";
     ul.appendChild(li);
}
body.append(ul);
//  4. Replace an existing <div> element with a new one containing different text.
let divv = document.getElementById("gh");
let divvv = document.createElement("div");
divvv.style.backgroundColor ="pink";
divvv.style.height = "100px";
divvv.style.width = "100px";
divvv.style.marginBottom = "10px";
divv.replaceWith(divvv)

// 5. Change the 'src' and 'alt' attributes of an <img> element.
let img = document.getElementsByTagName("img")[0];
img.setAttribute("src", "new-image.jpg");
img.setAttribute("alt", "New description");


//6. Change the text content of an element using textContent
let p1 = document.getElementById("jkk");
p1.textContent = "Hello world";

// 7. Remove one class from an element and add another class.
let div1 = document.getElementsByClassName("lm")[0];
div1.classList.remove("lm");
div1.classList.add("mm");

//  8. Insert a newly created <p> element before an existing <h2> element.
let p2 = document.createElement("p");
p2.innerText = "Hello kisuke";
let h2 = document.getElementsByTagName("h2")[0];
h2.before(p2);

// 9. Set innerHTML of a div to create multiple <p> elements at once.
let div3 = document.getElementsByClassName("multp")[0];
div3.innerHTML = "<p>hello</p> <p>Vivek</p> <p>Patil</p>"

// 10. Create a <div> and set its width, height, and background color via style.
let div4 = document.getElementsByClassName("multpp")[0];
div4.style.width = "100px";
div4.style.height = "100px";
div4.style.backgroundColor = "red";

// 11. Clone an existing element and append the clone to the body.

//12. Create a new input field and assign it a placeholder attribute.
let input = document.createElement("input");
input.placeholder = "Enter the number";
document.body.appendChild(input);


// 13. Create a <table> with 3 rows and 2 columns using JavaScript.
let table = document.createElement("table");

for (let i = 1; i <= 3; i++) {
    let tr = document.createElement("tr");
    let td1 = document.createElement("td");
    let td2 = document.createElement("td");

    td1.innerText = "Hello";
    td2.innerText = "Hello";
    tr.appendChild(td1);
    tr.appendChild(td2);
    table.appendChild(tr);
    td1.style.border = "2px solid black";
td2.style.border = "2px solid black";

}

table.style.border = "2px solid black";

document.body.appendChild(table); 

//14. Set a custom data-* attribute on an element and retrieve it.

//  15. Append a new option to an existing <select> element
let option = document.createElement("option");
option.innerText = "parth";
let select = document.getElementById("kj");
select.appendChild(option);

//16. Clear all children from a <div> using a loop or innerHTML.

//using innerHtml
let div5 = document.getElementById("idd");
// div5.innerHTML = "";

// for (let child of div5.children) {
//    child.remove();
// }

// 17. Wrap an existing element inside a new <section> tag.
let section = document.createElement("section");
section.innerText = "Helo "
section.style.border = "2px solid black";
section.style.height = "200px";
section.style.width = "200px";
div5.before(section);
section.appendChild(div5);

// 18. Create a paragraph and insert it as the first child of a <div>.
let p3 = document.createElement("p");
p3.innerText = "Hello Mamba";
div5.insertBefore(p3, div5.firstChild);

//19. Create a <style> tag dynamically and append CSS rules to it

//20. Check if a specific class exists on an element and log the result.