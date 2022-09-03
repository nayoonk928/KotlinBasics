package ny.tutorials.kotlinbasics

//변수와 데이터 유형 연습 문제
/*
fun main() {
    var courseName :String = "Android Masterclass"
    val leet : Float = 13.37F
    val pi : Double = 3.14159265358979
    var age : Byte = 25
    var year : Short = 2020
    var phoneNumber: Long = 18881234567
    var isGood : Boolean = true
    var firstCharacter : Char = 'a'
}
 */

// if statement 연습 문제
fun main() {
    var age = 15
    if (age >= 21) {
        println("you may drink in the US")
    } else if (age >= 18) {
        println("you may vote")
    } else if (age >= 16){
        println("you may drive")
    } else {
        println("you are too young")
    }
}