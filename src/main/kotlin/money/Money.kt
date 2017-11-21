package money

open class Money(amount: Int) {
    internal var amount: Int = amount
    
    override fun equals(other: Any?): Boolean {
        val money = other as? Money ?: return false
        return amount == money.amount
    }
}