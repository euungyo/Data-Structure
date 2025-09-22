interface QueueInterface<T> {
    fun enqueue(value: T): Boolean
    fun dequeue(): T?
    val count: Int
        get
    val isEmpty: Boolean
            get() = count == 0
    fun peek(): T?
}