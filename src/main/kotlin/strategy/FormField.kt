package strategy

class FormField(private val value: String, private var validator: Validator) {
    fun isValid(): Boolean {
        return validator.isValid(value)
    }

    fun setValidator(newValidator: Validator) {
        validator = newValidator
    }
}