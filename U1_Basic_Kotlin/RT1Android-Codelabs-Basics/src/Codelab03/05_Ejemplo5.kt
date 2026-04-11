package Codelab03

fun main() {
    println(birthdayGreeting5("Rover", 5))
    println(birthdayGreeting5(age = 2, name = "Rex"))
}

fun birthdayGreeting5(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}