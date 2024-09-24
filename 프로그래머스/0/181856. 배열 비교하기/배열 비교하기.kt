class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        val size1 = arr1.size
        val size2 = arr2.size
        
        return when{
            size1 > size2 -> 1
            size1 < size2 -> -1
            else -> when{
                arr1.sum() > arr2.sum() -> 1
                arr1.sum() < arr2.sum() -> -1
                else -> 0
            }
        }
    }
}