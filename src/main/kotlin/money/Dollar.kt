package money

data class Dollar constructor(val amount: Int) {
    fun times(multiplier: Int) : Dollar = Dollar(amount * multiplier)
}