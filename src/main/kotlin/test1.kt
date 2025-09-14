//class test1 {
//}




//fun main(){
//    var name1 = "우왕이"
//    val name2 = "left왕이"
//
//    name1 = "컴돌이"
//    name2 = "컴순이"




//
//fun main(){
//    var score: Int //타입 지정
//
//    score=70
//    score=71.0 //double
//    score="hey" //string
//}





//fun main(){
//    var scores1=arrayOf(100,98,80) //var scores1: Array<Int> = arrayOf(100,90,80)
//    var scores2: Array<Int>? = null //이 객체는 값이 있을수도 있고~ 없을수도(null) 있다
//    //이렇게 하면 null값인지 아닌지 체크 직접하지 않아도 안전하게 사용할 수 있다
//    //물음표를 쓰지 않으면 null값 자체를 넣을 수가 없다
//    var scores3:Array<Int> = scores2 ?: scores1 //scores2가 null이면 scores3=scores1, null이 아니면 scores3=scores2
//
//    print(scores1.size)
//    print(scores2?.size) //?를 붙이게 되면 null인지 아닌지 알 수 없음 -> null이면 접근 X null이 아니면 출력 그래서 걍 null출력
////    print(scores2!!.size) //null이 아니다 나를 믿으라!! -> error가 날 수 밖에~~
//
//    print(scores3.get(0)) //배열 0번째 출력



//fun main(){
//    val groupSize=2
//    when(groupSize){
//        1->println("Single")
//        2->println("Pair")
//        3->println("Trio")
//        else->println("This is either nobody or a big crowd") //->뒤에는 한문장만! 여러문장 쓰고 싶으면 중괄호로 묶기
//    }
//}



//
//fun main(){
//    for (i in 1..5){ //{1,2,3,4,5}집합에서 하나씩 빠져나와서 i에 들어간다
//        println(i)
//    }
//}




//fun main() {
//    var x=10
//    while(x>0){
//        x--
//    }
//    print(x)
//}





//
//fun f(k:Int): Int{
////    k *=2 -> 함수의 매개변수의 타입은 val로 건들 X
//    return k
//}
//
//fun main(){
//    var k: Int =5 //변수 5 선언
//    var ret: Int=f(k) //변수 k(가 가지고 있는 값5)가 함수 f로 전달 => 5가 전달되는거지 k가 전달되는게 아니다
//
//    println("$k\t$ret")
//}




//
//class Person(
//    private var age: Int,
//    public var name:String="Noname"
//) //클래스 이름 + 생성자 + 멤버 변수 이름
//
//{
//}
//
//fun main(){
//    var p1: Person = Person(10)
//    println(p1.name)
//}

//
//
//class Box{
//    var content: Any?=null
//    fun put(content: Any?){
//        this.content = content
//    }
//
//    fun retrieve(): Any?{
//        return content
//    }
//
//    fun isEmpty(): Boolean{
//        return content == null
//    }
//}
//
//fun main(){
//    var b1: Box=Box()
//    b1.put("apple")
//
//    var b2: Box=Box()
//    b2.put(3)
//
//    println(b1.retrieve())
//    println(b2.retrieve())
//
//    b1.put(5)
//}