class Solution {
    fun solution(n_str: String): String {
        return n_str.dropWhile{it == '0'}
    }
}