fun main() {
    // create two cats
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    binnie.walk()
    clyde.walk()
    flathead.eat()
    flathead.eat()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    println(binnie)
    println(clyde)
    println(flathead)
    println(cupra)
}