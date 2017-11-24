package money

class Sum(augend: Money, addend: Money) : Expression {
    internal var augend: Money = augend
    internal var addend: Money = addend

    override fun reduce(to: String): Money {
        val amount: Int = augend.amount + addend.amount
        return Money(amount, to)
    }
}