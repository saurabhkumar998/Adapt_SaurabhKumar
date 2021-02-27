var isEven = function isEven(num){
    if(num%2 === 0){
        return  true;
    }
    else{
        return false;
    }
}

function find(arr, isEven){
    i=0;
    while(i<arr.length){
        while(isEven(arr[i]) === false){
            i++;
        }
        return arr[i];
        
    }
}

arr=[1,3,5,4,2];
console.log(find(arr, isEven)); // this will print 4