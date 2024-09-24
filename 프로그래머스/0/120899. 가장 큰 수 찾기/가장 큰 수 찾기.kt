class Solution {
    fun solution(array: IntArray): IntArray {
        val max = array.maxOrNull() ?: 0
        return intArrayOf(max, array.indexOf(max))
    }
}
