class Solution {
    fun solution(price: Int): Int {
        val discount = when {
            price >= 500000 -> 0.8
            price >= 300000 -> 0.9
            price >= 100000 -> 0.95
            else -> 1.0
        }
        return (price * discount).toInt()
    }
}
