package strategy

class StrictPasswordValidator: Validator {
    override fun isValid(value: String): Boolean {
        val hasUppercase = value.any { it.isUpperCase() }
        val hasLowercase = value.any { it.isLowerCase() }
        val hasDigit = value.any { it.isDigit() }

        return value.length >= 8 && hasUppercase && hasLowercase && hasDigit
    }
}