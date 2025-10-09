class Cat (val name: String, var age: Int, var weight: Double) {

    fun walk(distance: Double) {
        println("$name walks $distance meters.")
    }

    fun eat(amount: Double) {
        if (weight + amount > 20) {
            println("Error: cannot exceed weight limit of 20.")
        } else {
            weight += amount
            println("$name eats $amount and now weighs $weight.")
        }
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
