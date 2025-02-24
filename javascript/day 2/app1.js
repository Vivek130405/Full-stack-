function display() {
    var HTMLL = document.getElementById("HTML");
    var Csss = document.getElementById("css");
    if(HTMLL.checked){
        document.getElementById("h").innerHTML = "<mark>" + HTMLL.value +"</mark>" ;
    }
    if(Csss.checked){
        document.getElementById("c").innerHTML = "<mark>" + Csss.value +"</mark>" ;
    }
}