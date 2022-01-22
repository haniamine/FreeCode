


const capitalize = e=> e.charAt(0).toUpperCase() + e.slice(1).toLowerCase()
// ex: test => Test / tEsT => Test

const removeSpace = text => text.replace(/\s/gm, '');
// ex: "test1 test2 test2 " => "test1test2test3"
