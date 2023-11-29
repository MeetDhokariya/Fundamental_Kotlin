fun main(){

    var num:Int?

    print("Enter NUmber = ")
    var n = readLine()!!

    num = n.toInt()

    if(num%2==0)
    {
        println("$num is Even Number.")
    }
    else
    {
        println("$num is Odd Number.")
    }
   
}