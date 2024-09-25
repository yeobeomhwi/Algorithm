class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var numer = numer1 * denom2 + numer2 * denom1 
        var denom = denom1 * denom2 
        
        var max = 1
        
        for (i in 1..numer.coerceAtMost(denom)) {
            if (denom % i == 0 && numer % i == 0) {
                max = i
            }
        }
        numer /= max
        denom /= max

        return intArrayOf(numer, denom)
    }
}