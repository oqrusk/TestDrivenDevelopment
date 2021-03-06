package money

open class Money(amount: Int, currency: String) : Expression {

    internal var amount: Int = amount
    internal var currency = currency

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    override fun times(multiplier: Int): Expression = Money(amount * multiplier, currency)

    override fun plus(addend: Expression): Expression = Sum(this, addend)

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount!! / rate!!, to)
    }

    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false

        return amount == money.amount
                && currency.equals(money.currency)
    }

    fun currency(): String? = currency

}