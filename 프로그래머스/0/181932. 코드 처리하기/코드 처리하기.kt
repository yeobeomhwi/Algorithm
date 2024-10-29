class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = false
        for(i in code.indices){
            if(code[i] =='1'){
                mode = !mode
                continue 
            }
            if(mode == false && i % 2 ==0){
                answer+= code[i]
            }
            if(mode == true && i % 2 == 1){
                answer+= code[i]
            }
        }
        if(answer.isEmpty()){
            return "EMPTY"
        }
        return answer
    }
}