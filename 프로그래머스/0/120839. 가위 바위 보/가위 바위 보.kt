class Solution {
    fun solution(rsp: String): String {
        var answer = ""
        for (ch in rsp) {
            answer += when (ch) {
                '2' -> '0'
                '0' -> '5'
                '5' -> '2'
                else -> ch
            }
        }
        return answer
    }
}
