class Solution {
    fun solution(start: Int, end_num: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        for (i in start downTo end_num) {
            answer += i
        }
        return answer.toList()
    }
}