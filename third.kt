 fun main() {
    
    var a:Int?;
    var b:Int?;

    print("Enter the value of A = ")
    var x = readLine()!!;
    print("Enter the value of B = ")
    var y = readLine()!!;

    a =x.toInt();
    b =y.toInt();
    
    println("Multiplication of A * B = ${a*b}")

} 