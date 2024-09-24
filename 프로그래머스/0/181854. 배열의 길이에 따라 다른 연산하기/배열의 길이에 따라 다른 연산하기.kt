class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        val answer = arr
        
        if(arr.size % 2 != 0){
            for(i in arr.indices ){
                if(i % 2 == 0){
                    answer[i] += n   
                }
            }
        }else{
           for(i in arr.indices ){
                if(i % 2 != 0){
                    answer[i] += n   
                }
            }
        }
        return answer
    }
}