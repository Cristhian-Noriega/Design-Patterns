package strategy

fun main() {

    val usernameField = FormField("messi", UsernameValidator())
    val passwordField = FormField("password123", PasswordValidator())
    val emailField = FormField("messi.10@example.com", EmailValidator())

    println("Username is valid: ${usernameField.isValid()}")
    println("Password is valid (basic): ${passwordField.isValid()}")
    println("Email is valid: ${emailField.isValid()}")

    passwordField.setValidator(StrictPasswordValidator())

    println("Password is valid (strict): ${passwordField.isValid()}")

}