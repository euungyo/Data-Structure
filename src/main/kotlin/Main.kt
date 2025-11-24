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




//fun main(){
//    var o1: ChildOfInterface = ChildOfInterface(10)
////    println(o1)
////    println(o1.f1())
//    println(o1.f2("A"))
////    println(o1.f3("B"))
////    println(o1.f4())
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
//
//fun main(){
//    val list=LinkedList<Int>()
//    list.push(10).push(30).push(20)
//    println(list)
//}


//fun main(){
//    val list = LinkedList<Int>()
//    list.append(10)
//    list.append(30)
//    list.append(20)
//    println(list)
//}


//fun main(){
//    val list = LinkedList<Int>()
//    list.append(10).append(30).append(20)
//    println(list)
//}



//
//fun main(){
//    val list = LinkedList<Int>()
//    list.append(10).append(30).append(20)
//    println(list)
//
//    println(list.nodeAt(2))
//    println(list.nodeAt(3))
//}




//fun main(){
//    val list = LinkedList<Int>()
//    list.append(10).append(30).append(20)
//
//    println("before inserting: $list")
//    var middleNode = list.nodeAt(1)!!
//    for(i in 1..3){
//        middleNode = list.insert(-1*i, middleNode)
//    }
//    println("after inserting: $list")
//}



//fun main(){
//    val list = LinkedList<Int>()
//    var poppedValue = list.pop()
//    println(poppedValue)
//
//    list.append(10).append(30).append(20)
//
//    println("Before popping list: $list")
//    poppedValue = list.pop()
//    println("After popping list: $list")
//    println("Popped value: $poppedValue")
//}


//
//fun main(){
//    val list = LinkedList<Int>()
//    list.append(10).append(30).append(20)
//
//    println("Before removing last node: $list")
//    val removedValue = list.removeLast()
//    println("After removing last node: $list")
//    println("Removed value: $removedValue")
//}



//fun main(){
//    val list = LinkedList<Int>()
//    list.append(10).append(30).append(20)
//
//    println("Before removing at particular: $list")
//    val index=1
//    val node = list.nodeAt(index-1)!!
//    val removedValue = list.removeAfter(node)
//    println("After removing at index $index: $list")
//    println("Removed $removedValue")
//}


//fun main(){
//    val list = LinkedList<Int>()
//    list.push(3)
//    list.push(2)
//    list.push(1)
//
//    var list2 = LinkedList<Int>()
//    list2.append(2).append(3)
//
//    println(list.containsAll(list2))
//}



//fun main(){
//    val stack = Stack<Int>().apply{
//        push(1)
//        push(2)
//        push(3)
//        push(4)
//    }
//    println(stack)
//    val poppedElement = stack.pop()
//    if(poppedElement != null){
//        println("Popped: $poppedElement")
//    }
//    print(stack)
//}





//fun main(){
//    var f1=Flower.bud.bloom("Rose")
//    var f2=Flower.bud.bloom("Hibiscus")
//
//    println(f1)
//    println(f2)
//}






//fun makeBeverageTree(): TreeNode<String> {
//    val tree = TreeNode("Beverages")
//    val hot = TreeNode("hot")
//    val cold = TreeNode("cold")
//    val tea = TreeNode("tea")
//    val coffee = TreeNode("coffee")
//    val chocolate = TreeNode("cocoa")
//    val blackTea = TreeNode("black")
//    val greenTea = TreeNode("green")
//    val chaiTea = TreeNode("chai")
//    val soda = TreeNode("soda")
//    val milk = TreeNode("milk")
//    val gingerAle = TreeNode("ginger ale")
//    val bitterLemon = TreeNode("bitter lemon")
//    tree.add(hot)
//    tree.add(cold)
//    hot.add(tea)
//    hot.add(coffee)
//    hot.add(chocolate)
//    cold.add(soda)
//    cold.add(milk)
//    tea.add(blackTea)
//    tea.add(greenTea)
//    tea.add(chaiTea)
//    soda.add(gingerAle)
//    soda.add(bitterLemon)
//    return tree
//}
//
//fun main(){
//    val tree = makeBeverageTree()
//    tree.forEachDepthFirst { println(it.value) }
//}




//fun makeBinaryTree(): BinaryNode<Int> {
//    val zero = BinaryNode(0)
//    val one = BinaryNode(1)
//    val five = BinaryNode(5)
//    val seven = BinaryNode(7)
//    val eight = BinaryNode(8)
//    val nine = BinaryNode(9)
//    seven.leftChild = one
//    one.leftChild = zero
//    one.rightChild = five
//    seven.rightChild = nine
//    nine.leftChild = eight
//    val tree = seven
//    return tree
//}
//fun main(){
//    val tree = makeBinaryTree()
//}



//fun makeAVLTree(): AVLNode<Int>{
//    val one = AVLNode(1)
//    val seven = AVLNode(7)
//    val eight = AVLNode(8)
//    val nine = AVLNode(9)
//    val eleven = AVLNode(11)
//    val ten = AVLNode(10)
//    val fifteen =  AVLNode(15)
//    seven.leftChild = one
//    seven.rightChild = nine
//    nine.leftChild = eight
//    nine.rightChild = eleven
//    eleven.leftChild = ten
//    eleven.rightChild = fifteen
//    return seven
//}
//
//fun main(){
//    var tree = makeAVLTree()
//    println(tree)
//    println("height: ${tree.height()}")
//}
//



//fun f1(a: ArrayList<Int>?): Int{
//    a?.add(a.size)
//    a?.addAll(f2())
//    return a.size
//}
//
//fun f2(): ArrayList<Int>{
//    return arrayListOf(10,20)
//}
//fun main(){
//    val b = arrayListOf(5)
//    println(f1(b))
//    println(b)
//    println(f1(null))
//}