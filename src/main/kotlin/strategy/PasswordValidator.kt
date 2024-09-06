package strategy

class PasswordValidator: Validator {
    override fun isValid(value: String): Boolean {
        return value.length >= 8
    }
}