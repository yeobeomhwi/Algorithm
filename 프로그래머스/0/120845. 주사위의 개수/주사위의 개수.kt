class Solution {
    fun solution(box: IntArray, n: Int): Int {
        val width = box[0] / n
        val height = box[1] / n
        val depth = box[2] / n
        return width * height * depth
    }
}