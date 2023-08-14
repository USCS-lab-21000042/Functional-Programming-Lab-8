object Q3 extends App{
    val toUper=(x:String)=>x.toUpperCase()
    val toLower=(x:String)=>x.toLowerCase()
    var list=List("Kamla","AmaL","ViSAl","Sewwandi")
    println(list.map(x=>toLower(x)))
    println(list.map(y=>toUper(y)))
}