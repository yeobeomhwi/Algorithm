class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        return numbers[numbers.size - 1] * numbers[numbers.size - 2]
    }
}