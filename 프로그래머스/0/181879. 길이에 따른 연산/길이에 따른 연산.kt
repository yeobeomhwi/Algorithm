class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 1
        var length = num_list.size
        num_list.forEach{ num ->
            if(length > 10){
                answer += num
                
            }else{
                answer *= num
            }
        }
        
        if(length >10){
            answer--
        }
        return answer
    }
}