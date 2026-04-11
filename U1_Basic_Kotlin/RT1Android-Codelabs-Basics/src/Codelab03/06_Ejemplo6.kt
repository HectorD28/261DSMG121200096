package Codelab03

fun main() {
    println(birthdayGreeting6(age = 5))
    println(birthdayGreeting6(age = 2))
}

fun birthdayGreeting6(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}