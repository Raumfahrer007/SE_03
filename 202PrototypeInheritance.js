//Prototype based + Multiple
let animal = {
    age: 20,
    walk() {
        console.log("Animal walks")
    }
}

let duck = {
    __proto__: animal
}

duck.walk()
duck.age = 30
console.log(duck.age)
console.log(animal.age)