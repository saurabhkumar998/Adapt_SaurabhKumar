function square(x){
    return x*x;
}
function double(x){
    return x*2;
}

function composedValue(x){
   console.log(square(double(x)));
}

composedValue(5); // the output will be 100