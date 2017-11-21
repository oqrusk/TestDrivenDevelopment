package money

open class Money(amount: Int) {
    internal var amount: Int = amount

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount)
        fun franc(amount: Int): Franc = Franc(amount)
    }

    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false

        return amount == money.amount
                && javaClass.equals(money.javaClass)
    }
}