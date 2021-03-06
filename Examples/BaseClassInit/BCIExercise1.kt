// BaseClassInit/BCIExercise1.kt
package baseclassinit
import atomictest.*

private var trace = Trace()

open class A {
  init {
    trace("A")
  }
}

open class B : A() {
  init {
    trace("B")
  }
}

class C : B() {
  init {
    trace("C")
  }
}

fun main() {
  C()
  trace eq "ABC"
}
