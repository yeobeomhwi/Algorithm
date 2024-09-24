class Solution {
    fun solution(n: Int, k: Int): Int {
        var lamb_skewers = n * 12000
        var drink = (k - n / 10) * 2000
        var answer: Int = lamb_skewers + drink
        return answer
    }
}