const Soap_products = ["Lux","Santoor","cinthol","Dove","Lifeboy"];
Soap_products.forEach(function(value,index){
    console.log(`Product : ${value}`);
});

const temperature_celsius = [30,47,45,42,28,18];
const temperature_Fahrenheit = temperature_celsius.map(function(c){
    return (c*9/5)+32;
});
console.log(temperature_Fahrenheit);

const string_above_four_character = Soap_products.filter(function(v){
    return v.length > 4;
})
console.log(string_above_four_character);