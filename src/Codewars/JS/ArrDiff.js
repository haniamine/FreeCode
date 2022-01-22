

//// CODE WARS
//// https://www.codewars.com/kata/523f5d21c841566fde000009 ////

function arrayDiff(a, b) {
    console.log("b= ",b)
    return a.filter(e=>  !b.includes(e))
}


console.log(arrayDiff([], [4,5]), [])
console.log(arrayDiff([3,4], [3]), [4])
