function padChars(n, str){
    let result = "";
    for(i=0;  i<n; i++){
        result = result + str;
    }
    return result;
}

console.log(padChars(5,"x"));