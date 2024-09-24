class Solution {
    fun solution(a: Int, b: Int): Int {
        var A = (a.toString() + b.toString()).toInt()
        var B = 2 * a * b
        if(A > B){
            return A
        }else{
            return B
        }
    }
}