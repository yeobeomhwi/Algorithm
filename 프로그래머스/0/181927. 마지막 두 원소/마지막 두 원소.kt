class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list.toMutableList().apply{
            val (second, first) = num_list.takeLast(2)
            if(first > second) add(first - second)
            else add (first * 2)
        }
        return answer.toIntArray()
    }
}