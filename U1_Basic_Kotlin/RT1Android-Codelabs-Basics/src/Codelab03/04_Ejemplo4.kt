package Codelab03

fun main() {
    println(birthdayGreeting4("Rover", 5))
    println(birthdayGreeting4("Rex", 2))
}

fun birthdayGreeting4(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}