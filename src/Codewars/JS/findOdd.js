
//////////////////// CODEWARS
///////////// https://www.codewars.com/kata/54da5a58ea159efa38000836/train/javascript

function findOdd(A) {
    const occ = A.reduce(function (acc, curr) {
        return acc[curr] ? ++acc[curr] : acc[curr] = 1, acc
    }, {});
    return parseInt(Object.keys(occ).find(e=> occ[e] % 2 !== 0 ));
}

console.log(findOdd([20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5]), 5)
console.log(findOdd([1,1,2,-2,5,2,4,4,-1,-2,5]), -1)
