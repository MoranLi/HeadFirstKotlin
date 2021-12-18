import kotlin.random.Random

fun enterChoose() : Int {
    print("Enter your choose 0,1,2: ")
    var pick = readLine()?.toInt()
    while(pick!! < 0 || pick!! > 2) {
        print("Enter your choose 0,1,2: ")
        pick = readLine()?.toInt()
    }
    return pick;
}

fun enterChoose2(choose: Array<String>) : Int{
    print("Enter your choose(")
    for(s in choose){
        print(s+",")
    }
    print("): ")
    var pick = readLine();
    while(pick == null || !choose.contains(pick)){
        pick = readLine();
    }
    return choose.indexOf(pick);
}

fun main(args: Array<String>) {
    var choose = arrayOf("Rock", "Paper", "Scissor")
    var pick = enterChoose2(choose);
    var random = Random.nextInt(0,3)
    println(choose[pick] +"," + choose[random])
    when{
        pick == random -> println("Tire")
        pick > random || (pick == 0 && random == 2) -> println("Win")
        else -> println("Fail")
    }


}