class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        if(k % 2 != 0){
            return arr.map{ it * k }.toIntArray()
        }else {
            return arr.map{ it + k }.toIntArray()
        }
    }
}