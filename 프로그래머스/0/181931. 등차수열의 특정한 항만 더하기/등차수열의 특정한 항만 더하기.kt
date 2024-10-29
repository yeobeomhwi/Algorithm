class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var sum = a
        for (i in included.indices){
            if(included[i] == true){
                answer+= sum
            }
             sum+= d
        }
        return answer
    }
}