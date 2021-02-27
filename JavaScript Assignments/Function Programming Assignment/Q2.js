var f1 = function square(x){
    return x*x;
}
var f2  = function double(x){
    return x*2;
}
function compose(square, double, x){
    return square(double(x));
}

compose(f1,f2, 5);  // the output will be 100