class Cat (val name: String, var age: Int, var weight: Int) {

    fun walk(distance: Double) {
        println("$name walks $distance meters.")
    }

    fun eat(amount: Double = 1.0) {
        if (weight + amount > 20) {
            println("Error: $name cannot eat that much! Weight limit (20) reached.")
        } else {
            weight += amount
            println("$name eats $amount and now weighs $weight.")
        }
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
