class Solution {
    fun solution(num_list: IntArray): Int {
        val length = num_list.size
        return if (length > 10) {
            num_list.sum() 
        } else {
            num_list.reduce { acc, num -> acc * num } 
        }
    }
}
