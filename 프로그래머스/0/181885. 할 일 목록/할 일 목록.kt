class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        val answer = mutableListOf<String>()
        todo_list.forEachIndexed { index, todo ->
            if (!finished[index]) {  
                answer.add(todo)   
            }
        }
        
        return answer.toTypedArray()
    }
}
    