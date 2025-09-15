class Main {
}

//fun main(){
//    var o1: TestDataClass = TestDataClass(3)
//    println(o1)
//}


//fun main(){
//    var o1:TestDataClass=TestDataClass(3)
//    var o2:TestDataClass=TestDataClass(5, "hello")
//    val o3:TestDataClass = o2.copy()
//
//    val eq: Boolean=o1.equals(o2) //o1과 o2가 같냐 t/f
//    println(eq)
//    println(o2.equals(o3)) //o2와 o3가 같냐
//
//    var(a,b)=o1 //신박한변수선언방법!!
//    println("$a\t$b")
//    println(o1)
//}




//fun main(){
//    var o1: TestAbstClass = ChildOfAbstClass()
//    println(o1)
//    println(o1.f1())
//    println(o1.f2())
//}



//
//fun main(){
//    var o1: ChildOfInterface = ChildOfInterface(10)
//    println(o1)
//    println(o1.f1())
//    println(o1.f2("A"))
//    println(o1.f3("B"))
//    println(o1.f4())
//}



//fun main(){
//    var c1=Cat(name="Tom")
//    c1.talk()
//}





//fun main() {
//    var tc = Man("Kevin", 23, "Student")
//
//    println(tc.age)
//    println(tc.job)
//    println(tc.address)
//    println(tc.strength)
//
//    tc.address="Earth"
//    println(tc.address)
//
//    tc.cursed=true
//    println(tc.speed)
//}






//fun main() {
//    val node1 = Node(value = 1)
//    val node2 = Node(value = 2)
//    val node3 = Node(value = 3)
//    node1.next = node2
//    node2.next = node3
//    println(node1)
//}



//fun main() {
//    val list = LinkedList<Int>()
//    list.push(10)
//    list.push(30)
//    list.push(20)
//    println(list)
//}

fun main(){
    val list=LinkedList<Int>()
    list.push(10).push(30).push(20)
    println(list)
}