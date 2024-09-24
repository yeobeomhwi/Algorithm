class Solution {
    fun solution(a: Int, b: Int): Int {
        var ab = (a.toString() + b.toString()).toInt()
        var ba = (b.toString() + a.toString()).toInt()
        if(ab >= ba) return ab else return ba
    }
}