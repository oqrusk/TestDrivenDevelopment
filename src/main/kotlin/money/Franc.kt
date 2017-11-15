package money


data class Franc constructor(val amount: Int) {
    fun times(multiplier: Int) : Franc = Franc(amount * multiplier)
}