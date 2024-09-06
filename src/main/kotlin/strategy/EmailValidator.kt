package strategy

class EmailValidator: Validator {
    override fun isValid(value: String): Boolean {
        return value.contains("@") && value.contains(".")
    }
}