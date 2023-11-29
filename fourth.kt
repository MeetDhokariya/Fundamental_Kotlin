fun main()
{
   var a:Int?

   print("Enter the value of A = ")
    var x = readLine()!!;

    a = x.toInt();

    for(i in 1..10)
    {
        println("$a * $i = ${a*i}")
    }

    
}