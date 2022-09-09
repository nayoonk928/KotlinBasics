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
/*
    val myName = "Nayoon"
    print("Hello " +myName)
*/

    // https://kotlinlang.org/docs/basic-types.html
    // Integer Types: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
/*    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300*/

    // Floating Point number Types: Float (32 bit), Double (64 bit)
/*    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846*/

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
/*    var isSunny: Boolean = true
    isSunny = false*/

    // Characters
/*    val letterChar = 'A'
    val digitChar = '1'*/

    // Strings
   /* val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    var myLength = myStr.length
    println("First character " +firstCharInStr)
    println("Last character $lastCharInStr")
    println("First character $firstCharInStr and the length of myStr is $myLength")*/

    // https://www.callicoder.com/kotlin-operators/
    // Arithmetic operators (+, -, *, /, %)
   /* var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble: Double
    resultDouble = a / b
    print(resultDouble)*/

    // Comparison operators (==, !=, <, >, <=, >=)
    /*val isEqual = 5 == 3
    println("isEqual is $isEqual")

    val isNotEqual = 5 != 5
    // String interpolation
    println("isNotEqual is $isNotEqual")
    println("is-5less3 ${-5 < 3}")
    println("is5LowerEqual3 ${5 <= 3}")
    println("is5GreaterEqual3 ${5 >= 3}")*/

    // Assignment operators (+=, -=, *=, /=, %=)
/*    var myNum = 5
    myNum += 3
    println("myNum is $myNum")*/

    // Increment & Decrement operators (++, --)
/*    myNum++
    println("myNum is $myNum")
     //increments after use
    println("myNum is ${myNum++}")
     //increments before use
    println("myNum is ${++myNum}")*/

    // if statement
    // https://kotlinlang.org/docs/reference/control-flow.html
    // https://kotlinlang.org/docs/control-flow.html
    /*var heightPerson1 = 170
    var heightPerson2 = 170

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else  if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    } else {
        println("use technique")
    }

    val age = 21
    if (age >= 21) {
        println("you may drink in the US")
    } else if (age >= 18) {
        println("you may vote now")
    } else if (age >= 16){
        println("you may drive now")
    } else {
        println("you are too young")
    }

    var name = "Denis"
    if (name == "Denis") {
        println("Welcome home denis")
    } else {
        println("Who are you?")
    }
*/
    /*var isRainy = true
    if(isRainy)
       println("It's rainy")*/

    //식으로 된 if statement
    //create a variable for testing all condition
    /*val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
//return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    print("current age is $currentAge")*/

    // when statement
    // https://kotlinlang.org/docs/control-flow.html
    /*var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    when(age){
        !in 0..20 -> println("you may drink in the US")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else -> println("you are too young")
    }

    var x : Any = "13.37f"
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }*/

    // 식으로 된 When statement

    /**
    var x : Any = 13.37
    when(x) {
    is Int -> println("$x is an Int")
    !is Double -> println("$x is not Double")
    is String -> println("$x is a String")
    else -> println("$x is none of the above")
    }
     **/

    /*val x : Any = 13.37
//assign when to a variable
    val result =  when(x) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
    print("$x $result")*/

    // While loop executes a block of code repeatedly as long as a given condition is true
    // https://kotlinlang.org/docs/control-flow.html
    /*var x = 1
    while(x <= 10) {
        print("$x")
        x++
    }
    println("\nwhile loop is done")*/

    // do while loop
    /*var x = 15
    do {
        print("$x")
        x++
    } while (x <= 10)
    println("\ndo while loop is done")*/

    // while loop with if statement
    /*var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }*/

    // for loop
    /*for(num in 1..10){
        print("$num")
    }

    for(i in 1 until 10){ // Samd as - for(i in 1.until(10))
        print("$i ")
    }
    println("__________")
    for(i in 10 downTo 1 step 2){ // Same as - for(i in 10.downTo(2).step(2))
        print("$i ")
    }*/
}