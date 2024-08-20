const numbers = [3, 10, 2, 9, 5, 1, 8, 4];
console.log("Initial numbers: " + numbers)
//Map
const squared = numbers.map(num => num * num);
console.log("\n---Map---\nResult: " + squared)

//Filter
const evenNumbers = numbers.filter(num => num % 2 === 0);
console.log("\n---Filter---\nResult: " + evenNumbers);

//Reduce
const sum = numbers.reduce((accu, value) => accu + value, 0)
console.log("\n---Reduce---\nResult: " + sum);

//Some
const hasEven = numbers.some(num => num % 2 === 0)
console.log("\n---Some---\nResult: " + hasEven);

//Every
const belowTen = numbers.every(num => num < 10)
console.log("\n---Every---\nResult: " + belowTen);

//Compose
const compose = (f, g) => x => f(g(x))
const double = x => x*2
const add1 = x => x+1
const addThenDouble = compose(double, add1)
const composeResult = numbers.map(num => addThenDouble(num))
console.log("\n---Compose---\nResult: " + composeResult);