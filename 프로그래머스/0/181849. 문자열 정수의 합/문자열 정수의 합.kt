class Solution {
    fun solution(num_str: String): Int {
        var answer = num_str.map{it.toString().toInt()}.sum()
        return answer
    }
}