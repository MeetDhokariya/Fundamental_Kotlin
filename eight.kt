
/*
  p = principal Amount
  r = rate
  t = time (in yeras) 
*/
fun main(){
    
    var p:Int?
    var r:Int?
    var t:Int?
    var si:Int?

    print("Enter Principal Amount = ")
    var x = readLine()!! 
    print("Enter Interest Rate = ")
    var y = readLine()!! 
    print("Enter Time in Years = ")
    var z = readLine()!! 

    p = x.toInt()
    r = y.toInt()
    t = z.toInt()

    si = p*r*t/100
    println("Simple Interest = $si")



}