function parity(x){
    if(x%2 === 0){
        return "even";
    }
    else{
        return "odd";
    }
}

console.log(parity(1)); // this will print "odd".
console.log(parity(2)); // this will print "even".