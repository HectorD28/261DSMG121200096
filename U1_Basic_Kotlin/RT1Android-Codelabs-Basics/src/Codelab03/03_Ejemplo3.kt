package Codelab03

fun main() {
    println(birthdayGreeting3("Rover"))
    println(birthdayGreeting3("Rex"))
}

fun birthdayGreeting3(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}