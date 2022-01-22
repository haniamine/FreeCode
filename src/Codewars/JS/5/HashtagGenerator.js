

//// CODE WARS
//// https://www.codewars.com/kata/52449b062fb80683ec000024 ////

function generateHashtag (str) {
    const res = str.split(' ').map(e=> e.charAt(0).toUpperCase() + e.slice(1)).join("")
    return res.length === 0 || res.length >140 ? false: "#"+res;
}



console.log(generateHashtag(""), false)
console.log(generateHashtag("Do We have A Hashtag"), " ----- #DoWeHaveAHashtag")
