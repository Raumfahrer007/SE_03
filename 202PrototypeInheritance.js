//Prototype based + Multiple
let animal = {
    walk() {
        console.log("Animal walks")
    }
}

let duck = {
    __proto__: animal
}

duck.walk()