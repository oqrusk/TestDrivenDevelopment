package money


data class Dollar(override val amount: Int) : Money {
    fun times(multiplier: Int): Dollar = Dollar(amount * multiplier)
}