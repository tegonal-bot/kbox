// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toTuple

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple5LikeToTupleTest {

    @Test
    fun toTuple__returns_Tuple5_in_correct_order() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val dataClass = Dummy5(a1, a2, a3, a4, a5)

        expect(dataClass.toTuple()).toBeAnInstanceOf<Tuple5<List<String>, List<Int>, List<Long>, List<Float>, List<Double>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
        }
    }

    data class Dummy5(
        val a1: List<String>,
        val a2: List<Int>,
        val a3: List<Long>,
        val a4: List<Float>,
        val a5: List<Double>
    ): Tuple5Like<List<String>, List<Int>, List<Long>, List<Float>, List<Double>>
}