fun main(){
    Calculator(3,5)
    var inst1 =(35, 2)
    println(inst1)
}

/*Write and invoke a function that takes in any 2 strings and returns the first
character of the longer string or the first character of the first string if they are
equal in length.*/
fun twoStrings(one:String, two:String) {
    var x = one.length
    var y = two.length
    var a = one[0]
    var b = two[0]
    if (x<y){(return b)
    else
            ( x=y)
        return a
    })
}
}
/*Write and invoke one function that takes in an array of integers and returns
these 3 values: smallest, largest and average of all the elements*/
fun intArray(intArray: IntArray):IntArray{
    var z = ()

}
/*Write and call a function that takes in a string and splits it into all the
characters that constitute it. Your function should print out this output.*/
fun splitting(x:String){
    var split = x.split()
    println(split)
}
/*Write and call a function that takes in an array of strings, joins them all into
one string and returns it.*/
fun array(arrayOf:String):String{
    var arrays =

}*/

/*Create a calculator class that is capable of the following functions:
(i) Addition of any 2 numbers
(ii) Subtraction between any 2 numbers
(iii) Accurate division between any 2 numbers
(iv) Multiplication of any 2 numbers
Instantiate your calculator object and invoke all its functions*/
class Calculator(var first: Int, var second:Int){
    fun addition() {
        var add = first + second
    }


    fun subtraction(){
        var minus = first - second
    }
    fun division(){
        var divide = first / second
    }
    fun multiplication(){
        var multiplication = first * second
    }

}