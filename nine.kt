fun main(){

    var a:Int?
    var b:Int?
    var choice:Int?

    print("Enter The Value A = ")
    var x = readLine()!!
    print("Enter The Value B = ")
    var y = readLine()!!
    println("Press 1 for Addition")
    println("Press 2 for Substraction")
    println("Press 3 for Multiplication")
    println("Press 4 for Devision")
    println("Press 5 for Moduls")
    print("Enter Choice = ")
    var z = readLine()!!

    a = x.toInt()
    b = y.toInt()
    choice = z.toInt()

     when(choice)
    {
        1 -> println("Addition of $a + $b = ${a+b}")
        2 -> println("Addition of $a - $b = ${a-b}")
        3 -> println("Addition of $a * $b = ${a*b}")
        4 -> println("Addition of $a / $b = ${a/b}")
        5 -> println("Addition of $a % $b = ${a%b}")
        else -> println("Plz Enter Valid Choice!")
    }
    
    

}