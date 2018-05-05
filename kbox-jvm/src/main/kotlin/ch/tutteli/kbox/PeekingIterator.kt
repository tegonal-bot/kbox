package ch.tutteli.kbox

actual class PeekingIterator<out T>
actual constructor(itr: Iterator<T>) : Iterator<T> {
    private val itr = PeekingIteratorUnsynchronized(itr)

    @Synchronized override fun hasNext() = itr.hasNext()
    @Synchronized override fun next() = itr.next()
    @Synchronized actual fun peek() = itr.peek()
}
