package money

open class Money(amount: Int, currency: String?) {
    private var amount: Int = amount
    private var currency = currency

    fun times(multiplier: Int): Money? = Money(amount * multiplier, currency)

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount, "USD")
        fun franc(amount: Int): Franc = Franc(amount, "CHF")

    }

    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false

        return amount == money.amount
                && currency.equals(money.currency)
    }

    fun currency(): String? = currency

}