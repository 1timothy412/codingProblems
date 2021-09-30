// I think there's a better way by using division to find out the
// position of each number. I don't think you have to perform multiple conversion
let a = 120;
// Remove sign from number
let b = Math.abs(a);
// Convert number into string
b = b.toString();
// Create an empty array to store the string prior to reversing it
let c = [];
// Add number into an array
for (let i = 0; i< b.length; i++){
  c[i] = b[i];
}
// Reverse the array
c.reverse();
console.log (c)

// Create an empty string
let d ='';
// Convert back into a string
for (let i = 0; i < c.length; i++){
  d+= c[i];
}
console.log (d)

// Account for negative sign
if (a < 0){
  d = parseInt(d)*(-1)
}
else{
  d = parseInt(d)
}
console.log (typeof(d))
console.log (d)
