class Solution {
    fun solution(array: IntArray): Int {
        array.sort()
        var mid = array.size /2
        return if(array.size % 2 == 0){
            (array[mid-1] + array[mid])/2
        }else{
            array[mid].toInt()
        }
    }
}