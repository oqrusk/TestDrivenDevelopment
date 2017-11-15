package money


data class Franc(override val amount: Int): Money {
    fun times(multiplier: Int) : Franc = Franc(amount * multiplier)
}