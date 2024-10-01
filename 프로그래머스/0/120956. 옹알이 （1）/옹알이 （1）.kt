class Solution {
    fun solution(babbling: Array<String>): Int {
        val validSounds = listOf("aya", "ye", "woo", "ma")
        var answer = 0
        
        for (word in babbling) {
    
            var tempWord = word
            
            for (sound in validSounds) {
                if (tempWord.contains(sound)) {
                    tempWord = tempWord.replaceFirst(sound, " ")
                }
            }
            
     
            if (tempWord.trim().isEmpty()) {
                answer++
            }
        }
        
        return answer
    }
}
