import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int): Int {
       return when {
           a % 2 != 0 && b % 2 != 0 -> (a*a)+(b*b)
           a % 2 != 0 || b % 2 != 0 -> 2*(a+b)
           else -> abs(a-b)
       }
    }
}