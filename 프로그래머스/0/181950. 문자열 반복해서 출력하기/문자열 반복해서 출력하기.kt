fun main(args: Array<String>) {
		val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()
    var answer: String = ""
    for(i in 0 until a){
        answer += s1
    }
    print(answer)
}