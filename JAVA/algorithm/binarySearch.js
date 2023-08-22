const sortedNums1 = [1, 3, 5, 6];
const searchNum1 = 4;
const expected1 = false;

const sortedNums2 = [4, 5, 6, 8, 12];
const searchNum2 = 5;
const expected2 = false;

const sortedNums3 = [3, 4, 6, 8, 12];
const searchNums3 = 3;
const expected3 = true;


function binarySearch(sortedNums, searchNums) {

    var leftindex = 0;
    var rightindex = sortedNums.length-1
    while (leftindex <= rightindex){
        var midIdx = Math.floor(rightindex - leftindex /2);

        if(sortedNums[midIdx] === searchNums){
            return true ;
        }
        if (searchNums < sortedNums[midIdx]){
            rightindex = midIdx -1;
        }else {
            leftindex = midIdx+1
        }
    }
    return false;
}


function binarySearchRecursive(sortedNums, searchNum, leftIdx=0, rightIdx=sortedNums.length-1) {
    
     if(leftIdx > rightIdx) {
        return false;
    }
    // find the middle index
     var midIdx = Math.floor((leftIdx + rightIdx)/2)
     
     // if middle element is the searchNum, return the middle index
     if(sortedNums[midIdx] === searchNum) {
        return true;
    }
    
    // if middle element is smaller than searchNum, move the leftIdxindex to mid + 1
     if(sortedNums[midIdx] > searchNum){
         return binarySearchRecursive(sortedNums, searchNum, 0, rightIdx-1)
     }
     else{ // if middle element is greater than searchNum, move the rightIdx index to mid - 1
        return binarySearchRecursive(sortedNums, searchNum, midIdx +1, rightIdx)
     }
}


console.log(binarySearchRecursive(sortedNums1, searchNum1));
console.log(binarySearchRecursive(sortedNums2, searchNum2));
console.log(binarySearchRecursive(sortedNums3, searchNums3));

// console.log(binarySearch(sortedNums1, searchNum1));
// console.log(binarySearch(sortedNums2, searchNum2));
// console.log(binarySearch(sortedNums3, searchNums3));