package money

class Sum(augend: Expression, addend: Expression) : Expression {
    override fun plus(addend: Expression): Expression = Sum(this, addend)


    internal var augend: Expression = augend
    internal var addend: Expression = addend

    override fun reduce(bank: Bank, to: String): Money {
        val amount: Int = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }

    override fun times(multiplier: Int): Expression = Sum(augend.times(multiplier), addend.times(multiplier))

}