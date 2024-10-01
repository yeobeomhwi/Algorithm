class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val max = num_list.size
        val x = num_list.sliceArray(n until max)  
        val y = num_list.sliceArray(0 until n)    
        
        return x + y  
    }
}
