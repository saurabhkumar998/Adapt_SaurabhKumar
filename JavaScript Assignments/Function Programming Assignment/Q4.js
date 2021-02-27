var square = function square(x)
{
    return x*x;
}
var sqrt = function sqrt(x){
    return Math.sqrt(x);
}

var result = [];

function map(arr, fxn){
    
    for(i=0; i<arr.length; i++){
        result.push(fxn(arr[i]));
    }
}

arr1 = [1,2,3,4,5];
map(arr1, square);
console.log(result); // this will print [1, 4, 9, 16, 25]
result = [];
map(arr1, sqrt);
console.log(result); // this will print [1, 1.4142135623730951, 1.7320508075688772, 2, 2.23606797749979]
