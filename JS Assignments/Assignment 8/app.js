//1. When a button is clicked, change the background color of the page.
let clicke_me = document.getElementById("clicke_me");
clicke_me.addEventListener("click", () => {
    document.body.style.backgroundColor = "black";
})

//2. Double-click a box to change its text to something new
let div = document.getElementById("ra");
div.addEventListener("dblclick", () => {
    div.innerText = "Hello kisuke here";
})

// 3. When you move the mouse over an image, make it bigger
let img = document.getElementById("im");
img.addEventListener("mouseover", () => {
    img.style.width = "300px";
    img.style.height = "150px";
})

//4. When the mouse leaves the image, make it go back to normal size
img.addEventListener("mouseout", () => {
    img.style.width = "200px";
    img.style.height = "100px";
})

//  5. Click a button to add a new sentence to the page
let btn = document.getElementById("neww");
let p = document.createElement("p");
p.innerText = "Hello Bhai";
btn.addEventListener("click", () => {
    btn.after(p);
})

//  6. Click any list item to show its text in the console
let li = document.querySelectorAll(".li");
li.forEach((index) => {
    index.addEventListener("click", () => {
        let index_value = index.innerText;
        console.log(index_value);
    })
})

// 7. Right-click on a box to show a custom alert message
let div1 = document.getElementById("old");
div1.addEventListener("contextmenu", (e) => {
    e.preventDefault();
    alert("heyyyy");
})

// 8. Click a button to show or hide a message box
let old_button = document.getElementById("old_button");
old_button.addEventListener("click", () => {
    if (div1.classList.contains("show")) {
        div1.classList.remove("show");
        div1.classList.add("hide");
    } else {
        div1.classList.remove("hide");
        div1.classList.add("show");
    }
    if (div1.classList.contains("show")) {
        old_button.innerText = "Hide";
    } else {
        old_button.innerText = "Show";
    }
})

// 9. Press any key and show which key was pressed in the console.

document.addEventListener("keydown", function(event) {
      
    console.log(event.key); 
});

//  10. Click a button to make a copy of a box and add it to the page
let old_buttonn = document.getElementById("old_buttonn");
let div2 = document.getElementById("oldd");
old_buttonn.addEventListener("click",() =>{
   let clone = div2.cloneNode(true);
   div2.after(clone);

})

//  11. Move your mouse into a card to add a colored border.
let div3 = document.getElementById("div3");
div3.addEventListener("mouseenter", () =>{
    div3.style.border = "2px solid orange";
    div3.style.marginTop = "10px";
})

// 12. Move your mouse out of the card to remove the border.

div3.addEventListener("mouseout",() =>{
    div3.style.border = "none";
})

// 13. Scroll the page and log how far you have scrolled
window.addEventListener("scroll", ()=>{
    console.log(window.scrollY)
    
})

// 14. Click a button to add a new item to a list
let add_li = document.getElementById("add_li");
let ull = document.createElement("ul");
ull.innerText = "hello";
let body = document.body;
body.after(ull);
add_li.addEventListener("click",() =>{
    let li = document.createElement("li");
    li.innerText = "Hello world";
    ull.appendChild(li);
})

//  15. Click any colored button to highlight it.
//     Tip: Use querySelectorAll and classList.add on click

// let btnn = document.querySelectorAll("button");
let red = document.querySelector(".red");
let blue = document.querySelector(".blue");
let green = document.querySelector(".green");

red.addEventListener("click", () => {
    red.classList.add("highlight");
});

blue.addEventListener("click", () => {
    blue.classList.add("highlight");
});

green.addEventListener("click", () => {
    green.classList.add("highlight");
});

//  16. Click one button to turn off another button.

let la = document.getElementById("la");
let al = document.getElementById("al");
let all = document.getElementById("all");
al.addEventListener("click",()=>{
    alert("hello");
    
})
all.addEventListener("click",()=>{
    alert("hiee");

})

la.addEventListener("click",()=>{
     al.disabled = true;
     all.disabled = true;

})

//  17. Click a box and rotate it a little each time

let rotate = document.getElementById("rotate");
let angle = 70;
rotate.addEventListener("click",()=>{
   rotate.style.transform = `rotate(${angle}deg)`;

})

// 18. Click a button to switch between light mode and dark mode.
let switchh = document.getElementById("switch");
let hello = document.getElementById("hello");
switchh.addEventListener("click",()=>{
    if (hello.classList.contains("dark")) {
        hello.classList.remove("dark");
        hello.classList.add("light");
    } else {
         hello.classList.remove("light");
        hello.classList.add("dark");
    }
})

// 19. Click to change a heading's color to a random one
// 20. Click a button to remove the last item from a list.
