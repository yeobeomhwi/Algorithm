class Solution {
    fun solution(my_string: String): Array<String> {
        var answer = my_string.split(" ").filterNot{ it.isBlank() }  
        return answer.toTypedArray()
    }
}