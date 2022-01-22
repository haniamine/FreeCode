

//// CODE WARS
//// https://www.codewars.com/kata/5262119038c0985a5b00029f ////


// Execution Timed Out (12000 ms) /// CORRECT BUT TOO SLOW
function isPrimeold(num) {
    if(num%2===0 && num>2) return false
    for(let index = 3; index <= Math.floor(num/2); index += 2) {
        if(num%index===0)return false
    }
    return num>1
}

/// BETTER SOLUTION
const isPrime = x => {
    if (x > 2 && x % 2 ===0) return false

    for (let divisor=3; divisor<=Math.sqrt(x); ++divisor) {
        if (x % divisor === 0) return false
    }
    return x > 1
}
/**
 *  If x is not a prime, then we can find "a" and "b" such that
     a**2 <= x <= b**2 , where a,b ∈ N+
     => a <= sqrt(x) <= b
     So check until the sqrt(x) its upper bound is enough.
 **/


console.log(isPrime(0),  false);
console.log(isPrime(1),  false);
console.log(isPrime(2),  true);
console.log(isPrime(73), true);
console.log(isPrime(75), false);
console.log(isPrime(-1), false,);