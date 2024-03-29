/*
Square(n) Sum
Complete the square sum function so that it squares each number passed into it and then sums the results together.
For example, for [1, 2, 2] it should return 9.
*/

function squareSum(numbers)
{
  var sum = 0;
  for(var i = 0; i < numbers.length; i++)
  {
    sum += numbers[i] ** 2;
  }
  return sum;
}

//SOLUTIONS
/*
function squareSum(numbers){
  return numbers.reduce(function(sum, n){
    return (n*n) + sum;
  }, 0)
}
*/

/*
function squareSum(numbers){
  return numbers.reduce((sum,num) => sum + (num * num), 0);
}
*/

/*
function squareSum(numbers){
  var sum = 0;
  numbers.forEach(function(n) {
    sum += n * n
  });
  return sum;
}
*/

/*
function squareSum(numbers){
  var result = 0;
  for (var i = 0; i < numbers.length; i++) {
    result += (numbers[i] * numbers[i]);
  }
  return result;
}
*/

/*
function squareSum(numbers)
{ 
  var totalSum = 0;
  for (i=0;i<numbers.length;i++)
  {
    totalSum += Math.pow(numbers[i], 2);
  }
  return totalSum;
}
*/

/*

*/
