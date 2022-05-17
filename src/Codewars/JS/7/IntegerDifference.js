

//// CODE WARS
//// https://www.codewars.com/kata/57741d8f10a0a66915000001 ////

const intDiff = (arr, n) => {
    return arr.reduce( (s, v, i) => s+arr.slice(i + 1).reduce((s,w) => s+( Math.abs(v-w)=== n ? 1: 0 ),0),0 )
}



console.log(intDiff([1, 1, 5, 6, 9, 16, 27], 4), 3)
console.log(intDiff([1, 1, 3, 3], 2), 4)
