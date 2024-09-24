class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for(i in arr.indices){
            for(j in 1..arr[i]){
                answer.add(arr[i])
            }
        }
        return answer.toIntArray()
    }
}