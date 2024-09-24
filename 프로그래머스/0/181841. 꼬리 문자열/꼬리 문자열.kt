class Solution {
    fun solution(strList: Array<String>, ex: String) = strList.filter { !it.contains(ex) }.joinToString("")
}