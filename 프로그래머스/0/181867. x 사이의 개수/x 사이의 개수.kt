class Solution {
    fun solution(myString: String): IntArray {
        var answer = myString.split("x")
        val lengths = IntArray(answer.size)
        for (i in answer.indices) {
            lengths[i] = answer[i].length
        }
        return lengths
    }
}