
function addition(a, b) {const x = Number(a), y = Number(b);if (Number.isNaN(x) || Number.isNaN(y)) return 0; return x + y;}function soustraction(a, b) {return a - b;}if (require.main === module) {console.log("R sultat addition:", addition(5, 3));console.log("R sultat soustraction:", soustraction(5, 3));}module.exports = { addition, soustraction }; 

