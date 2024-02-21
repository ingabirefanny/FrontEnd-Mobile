fun main() {
    theName("fanny")
remainder(3,2)
    sum(2,3,4,5)
    aboutMe("I am funny")
}
fun theName(name:String){
    println("Hello $name")
}
fun remainder(a: Int, b:Int){
    var result= a%b
    println("the result= $result")
}
fun sum(a:Int, b:Int, c:Int, d:Int){
    var result= a+b+c+d
    println("the result=$result")
}
fun aboutMe(interestingFact:String){
    println(interestingFact)
}