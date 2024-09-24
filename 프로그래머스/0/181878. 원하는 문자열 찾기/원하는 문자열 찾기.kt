class Solution {
    fun solution(myString: String, pat: String): Int {
        return if(myString.toUpperCase().indexOf(pat.toUpperCase()) != -1) 1 else 0
    }
}