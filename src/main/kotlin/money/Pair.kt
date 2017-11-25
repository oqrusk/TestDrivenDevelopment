package money

class Pair(from: String, to: String) {
    val from: String = from
    val to: String = to

    override fun equals(other: Any?): Boolean {
        other as Pair
        if (from != other.from) return false
        if (to != other.to) return false

        return true
    }

    override fun hashCode(): Int = 0

}