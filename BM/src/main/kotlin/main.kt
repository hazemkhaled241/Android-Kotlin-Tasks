import java.util.*

fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)


    var firstSum: Double = 0.0;
    var sum: Double = 0.0;
    var flag: Boolean = true;
    val stringInput = readLine()!!

    var counter = 0
    var list = stringInput.split(" ").toMutableList()
    val array = Array<String>(list.size) { "0" }
    for (i in 1 until list.size step 2) {

        if (list[i] == "*") {
            if (list[i - 1] != "$") {
                firstSum = list[i - 1].toDouble() * list[i + 1].toDouble()
                list[i + 1] = "$"
                array[counter] = firstSum.toString()
                counter++
            } else {
                counter--
                firstSum = array[counter].toDouble()
                firstSum *= list[i + 1].toDouble()
                list[i + 1] = "$"
                array[counter] = firstSum.toString()
                counter++
            }
        } else if (list[i] == "/") {
            if (list[i + 1] == "0") {

                flag = false
                break
            }
            if (list[i - 1] != "$") {
                firstSum = list[i - 1].toDouble() / list[i + 1].toDouble()
                list[i + 1] = "$"
                array[counter] = firstSum.toString()
                counter++
            } else {
                counter--
                firstSum = array[counter].toDouble()
                firstSum /= list[i + 1].toDouble()
                list[i + 1] = "$"
                array[counter] = firstSum.toString()
                counter++

            }

        } else if (list[i] == "+") {
            if (list[i - 1] != "$") {
                array[counter] = list[i - 1]
                counter++
            }
            array[counter] = list[i]
            counter++
            array[counter] = list[i + 1]
        } else if (list[i] == "-") {
            if (list[i - 1] != "$") {
                array[counter] = list[i - 1]
                counter++
            }
            array[counter] = list[i]
            counter++
            array[counter] = list[i + 1]
        }

    }
    if (!flag)
        println("can't divide by zero")
    else{
        sum = array[0].toDouble()
    for (i in 0 until array.size) {
        if (array[i] == "+") {
            sum += array[i + 1].toDouble()

        } else if (array[i] == "-") {
            sum -= array[i + 1].toDouble()
        } else if (array[i] == "0")
            break


    }

    print(stringInput)
    print("=")
    print(sum)
    /*for (i in 0 until list.size  ){
        if(array[i]!="0")
            print("${array[i]} ")

    }*/
}

}
/*
 for (i in 0 until list.size  ){
       if(array[i]!="0")
        print("${array[i]} ")
    }
 */
/*
 fun double(x:Int):Int{
     return x*2;
 }*/



//val operator:Char= reader.next().single()
//val num1=reader.nextInt()
//val num2=reader.nextInt()
/* if(operator == '+'){
     println("$num1 + $num2 =${num1+num2}")
   }
    else if(operator == '-')
     println("$num1 - $num2 =${num1-num2}")
    else if(operator == '*')
     println("$num1 * $num2 =${num1*num2}")
    else if(operator == '/')
     println("$num1 / $num2 =${num1/num2}")
    */