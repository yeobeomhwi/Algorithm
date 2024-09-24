class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var str = myString.map{
            when(it){
                'A' -> 'B'
                'B' -> 'A'
                else -> it
            }
        }.joinToString("")
        
        return if(str.contains(pat)) 1 else 0
    }
}