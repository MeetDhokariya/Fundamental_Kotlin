fun main(){

    var n1:Int?
    var n2:Int?

    print("Enter the Value of N1 = ")
    var x = readLine()!!;
    print("Enter the Value of N2 = ")
    var y = readLine()!!;

     n1 = x.toInt()
     n2 = y.toInt()

     for(i in n1..n2)
     {
        for(j in 1..10)
        {
            println("$i * $j = ${i*j}")
        }
        println();
     }


}