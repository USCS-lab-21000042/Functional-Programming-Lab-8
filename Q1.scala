object Q1 extends  App{
    val deposit=(x:Int)=> x match { 
        case y if y<=20000                  => y*2/100
        case y if y>20000   && y<=200000    =>y*4/100
        case y if y>200000  && y<=2000000  =>y*3.5/100
        case y if y>2000000                 =>y*6.5/100

    }
}