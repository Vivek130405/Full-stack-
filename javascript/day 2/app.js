function display(event) {
    event.preventDefault();
    var FirstName = document.getElementById("fname").value;
    document.getElementById("firstname").innerHTML = "<mark>" + FirstName + "</mark>";

    var PassWord = document.getElementById("pass").value;
    document.getElementById("password").innerText = PassWord;
    
    var india = document.getElementById("india");
    var russia = document.getElementById("russia");
    var Usa = document.getElementById("Usa");

    if(india.checked){
        document.getElementById("checkIndia").innerText = india.value;
    }
    if(russia.checked){
        document.getElementById("checkRussia").innerText = russia.value;
    }
    if(Usa.checked){
        document.getElementById("checkUsa").innerText = Usa.value;
    }

   var Gender =  document.getElementsByName("r");
   console.log(Gender); //object
   for(let g of Gender){
    if(g.checked){
        document.getElementById("Gender").innerHTML = g.value;
    break;    }
   }
   

   
   
}