package strategy

class UsernameValidator: Validator {
    override fun isValid(value: String): Boolean {
        return value.isNotEmpty()
    }
}