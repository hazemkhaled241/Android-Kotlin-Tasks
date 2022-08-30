fun main(args:Array<String>) {

    var circle=Circle(2,"Circle")
    var rectangle=Rectangle(2,3,"Rectangle")
    var square=Square(3,"Square")

    println("${circle.shape} area is = ${circle.area()}")
    println("${rectangle.shape} area is = ${rectangle.area()}")
    println("${square.shape} area is = ${square.area()}")

}



open interface Shape{
    fun area():Double
}
class Circle(private var radius: Int,var shape: String):Shape{
    override fun area():Double {
        return (3.14*radius).toDouble()
    }


}
class Rectangle(private var x: Int, private var y: Int,var shape: String):Shape{
    override fun area():Double {
        return  (x*y).toDouble()
    }


}
class Square(private var x: Int,var shape: String):Shape{
    override fun area():Double {
        return (x*x).toDouble()
    }


}