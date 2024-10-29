class Solution {
    fun solution(my_string: String)= my_string.indices.map { i -> my_string.substring(i) }.sorted().toTypedArray()
    
}