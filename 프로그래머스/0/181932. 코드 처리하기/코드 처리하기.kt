class Solution {
    fun solution(code: String): String {
        var answer = ""
        var mode = false // false = 0, true = 1
        
        code.forEachIndexed { i, v ->
            if (v == '1') { 
                mode = !mode 
                return@forEachIndexed 
            } 
            else if (!mode && i % 2 == 0) {
                answer += v 
            } 
            else if (mode && i % 2 != 0) {
                answer += v 
            }
        }
        
        return if (answer.isNotEmpty()) answer else "EMPTY" 
    }
}
