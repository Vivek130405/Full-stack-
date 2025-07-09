var num = [1,"Vivek",true,[1.1,"k patil",false]];
console.log(num)
console.log(num[1])
console.log(num[1][1])
console.log(num[0][0])
console.log(num[1])


num[1]="Raj";
console.log(num);

// Adding & Removing Elements
console.log("Adding & Removing Elements")
num.push(2);
console.log(num);
num.pop();
console.log(num);
num.shift();
console.log(num);
num.unshift();
console.log(num);

const number =[1,2,3,4,5,6,7,8]
var nums = number.slice(1,4);
console.log(nums);
console.log(number);

number.splice(0,2);
console.log(number);

number.splice(0,2,6,7);
console.log(number);

const numbers =[1,2,3,4,5,6,7,8];

numbers.forEach(function(value,i){
    console.log(`At index ${i} value is ${value}`)
});

console.log();
numbers.forEach((value,i) => {
    console.log(`At index ${i} value is ${value}`)
});

console.log();
for (const element of numbers) {
     console.log(`value is ${element}`)
}

console.log();
for (let index = 0; index < numbers.length; index++) {
   
      console.log(`At index ${index} value is ${numbers[index]}`)
}

console.log();
const num10 = numbers.map(function(v){
    return v*10;
})
for (let index = 0; index < num10.length; index++) {
   
      console.log(`At index ${index} value is ${num10[index]}`)
}

// Activities
console.log("Activities");
const student = ["Vivek","Anand","Ajinkya","Rahul","Rohan"];
console.log(student[3]);

const numberss =[1,2,3,4,5,6,7,8,9,10];
const oddnum = numberss.filter(function(v){
    return v%2!=0
})
console.log(oddnum);

const double_ele = numberss.map(function(v){
    return v*2;
});
console.log(double_ele);