fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    for(h in 1..n){
        for(w in 1..h){
            print('*')
        }
        print("\n")
    }
}