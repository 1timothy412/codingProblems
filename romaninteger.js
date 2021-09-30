let roman = 'LVIII';
let newRoman = '';
let result = 0;
let x = [];
// Number 9
if (roman.includes('IX')){
 roman = roman.replace('IX','')
 result += 9;
// Number 4
}
if (roman.includes('IV')){
  roman = roman.replace('IV','')
  result += 4;
 }
 // Number 40
if (roman.includes('XL')){
  roman = roman.replace('XL','')
  result += 40;
 }
 // Number 90
if (roman.includes('XC')){
  roman = roman.replace('XC','')
  result += 90;
 }
 // Number 400
if (roman.includes('CD')){
  roman = roman.replace('CD','')
  result += 400;
 }
 // Number 900
if (roman.includes('CM')){
  roman = roman.replace('CM','')
  result += 900;
 }
console.log (roman)
console.log (result)

for (let i = 0; i < roman.length; i++){
  x[i] = newRoman[i];
  if (roman[i] == 'I'){
    result += 1;
  }
  if (roman[i] == 'V'){
    result += 5;
  }
  if (roman[i] == 'X'){
    result += 10;
  }
  if (roman[i] == 'L'){
    result += 50;
  }
  if (roman[i] == 'C'){
    result += 100;
  }
  if (roman[i] == 'D'){
    result += 500;
  }
  if (roman[i] == 'M'){
    result += 1000;
  }
  
}
console.log (result)
