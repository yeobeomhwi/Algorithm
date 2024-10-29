class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in strlist.indices){
            answer += strlist[i].length
        }
        return answer
    }
}