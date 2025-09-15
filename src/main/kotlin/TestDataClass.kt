data class TestDataClass(
    var a: Int,
    val b: String="Empty"
)
 {
    override fun toString(): String{
        return "Var a=$a, Val b=$b"
    }
}
