package strategy

interface Validator {
    fun isValid(value: String): Boolean
}