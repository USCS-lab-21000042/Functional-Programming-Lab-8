import scala.io.StdIn
object  Q2 extends  App{

    val matchpattern = (x:Int)=> x match{
        case y if y==0   => "Zero"
        case y if y<0    => s"${y} is a Negative number"
        case y if y%2==0 => s"${y} is an Even number"
        case _           => s"${x} is an Oven number"
    }
    print("Enter number: ")
    var x=StdIn.readInt()
    print(matchpattern(x))
}