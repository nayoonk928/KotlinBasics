package ny.tutorials.kotlinbasics

fun main() {
    // TODO: Add new functionality

    /*
    This
    is a multiline
    comment
     */

    // immutable variable = val, mutable variable = var
    // type string
    //type inference finds out the type from context
    val myName = "Nayoon"
    //print("Hello " +myName)

    // https://kotlinlang.org/docs/numbers.html
    // Integer Types: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    println("First character " +firstCharInStr)
    println("Last character " +lastCharInStr)
}