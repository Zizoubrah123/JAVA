function sum(n){
const int = parseInt(n)
    if (int < 1){
        return 0;
    }
    if(isNaN(int)){
        return null;
    }

    return int  + sum(int - 1);
}


const nums1 =[1,2,3];

function sumArr(nums, i){
    var sum = 0;
    if(i === nums.length){
        return sum;
    }

    returnnums[i] + sumArr()
}