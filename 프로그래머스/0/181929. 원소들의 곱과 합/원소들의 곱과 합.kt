class Solution {
    fun solution(num_list: IntArray): Int {
        var add = 0
        var mul = 1
        num_list.forEach{ num ->
            add += num
            mul *= num
        }
        return if(mul < add * add) 1 else 0
    }
}