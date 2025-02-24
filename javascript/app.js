// var a = parseInt(prompt("Enter value A "));
// var b = parseInt(prompt("Enter value B "));

function addition() {
    var a = 10;
    var b = 20;
   console.log(a+b)
    document.getElementById("addition").innerText = a+b;
}

function display(event) {
    event.preventDefault();
    first =  document.getElementById("fn").value;
    last =  document.getElementById("ln").value;
    document.getElementById("firstName").innerText = first;
    document.getElementById("LastName").innerText = last;
}