class Solution {
    fun solution(hp: Int)= (hp).let{
        (it / 5) + (it % 5).let{
            (it / 3) + (it % 3)
        }
    }
}