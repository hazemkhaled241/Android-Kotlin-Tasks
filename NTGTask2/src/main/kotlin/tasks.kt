fun main(args:Array<String>) {
    val list = mutableListOf("Maze", "More", "Man","Moon")
  println(task6(list))
  println(task5(list,2))
  println(task4(list))
  println(task3(list,3))
  println(task2(list,5))
  println(task1(list))

}
fun task1(list:List<String>):String{
    var counter=0
    var result=""
for (item in list){
    if(item.startsWith('M')&&'r' in item){
       counter++
        result=item
    }
}
    if(counter==1)
        return result
    else if(counter>1)
        return "There multiple results"
    else
        return "Not Found"
}
fun task2(list:List<String>,count:Int):Boolean {
    for (item in list){
        if(item.length>=count){
            return true
        }
    }
    return false
}



fun task3(list:List<String>,count:Int):Boolean {
    for (item in list){
        if(item.length<count){
            return false
        }
    }
    return true
}


fun task4(list:List<String>):List<String> {
    var flag=false
    var newList = mutableListOf<String>()

    for (i in list.size-1 downTo 0 ){
        if(!flag && list[i].startsWith('M')&&'a' in list[i]){
            flag=true
            continue
        }
        if(flag){
            newList.add(list[i])

        }
    }

    return newList.reversed()
}

fun task5(list:List<String>,count:Int):List<String> {
    var flag=false
    var newList = mutableListOf<String>()

    for (item in list){
        if(flag||item.length==count){
        newList.add(item)
        flag=true
        }
    }
    return newList
}

fun task6(list:List<String>):List<Int> {
    var sizeList = mutableListOf<Int>()
    for (item in list){
       sizeList.add(item.length)
    }
    return sizeList
}