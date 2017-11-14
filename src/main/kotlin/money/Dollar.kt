package money

class Dollar constructor(amount: Int) {

    var amount:Int = amount

    fun times(multiplier: Int) : Dollar = Dollar(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Dollar

        if (amount != other.amount) return false

        return true
    }
}