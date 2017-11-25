package money

class Bank {

    private val rates: HashMap<Pair, Int?> = HashMap()

    fun reduce(source: Expression, to: String): Money = source.reduce(this, to)

    fun addRate(from: String, to: String, rate: Int?) {
        rates.put(Pair(from, to), rate)
    }

    fun rate(from: String, to: String): Int? = if (from.equals(to)) 1 else rates.get(Pair(from, to))

}