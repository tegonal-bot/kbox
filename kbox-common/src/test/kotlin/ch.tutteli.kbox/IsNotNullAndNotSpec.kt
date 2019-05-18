package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.kbox.atrium.assert
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object IsNotNullAndNotSpec : Spek({

    describe("fun ${CharSequence?::isNotNullAndNotEmpty.name}") {
        listOf<Triple<String, CharSequence?, Boolean>>(
            Triple("null", null, false),
            Triple("empty String", "", false),
            Triple("empty StringBuilder", StringBuilder(), false),
            Triple("String \"   \"", "   ", true),
            Triple("StringBuilder \"   \"", StringBuilder("   "), true),
            Triple("String \"hello\"", "hello", true),
            Triple("StringBuilder \"hello\"", StringBuilder("hello"), true)
        ).forEach { (description, value, expected) ->
            it("given $description, expect $expected") {
                assert(value.isNotNullAndNotEmpty()).toBe(expected)
            }
        }
    }

    describe("fun ${CharSequence?::isNotNullAndNotBlank.name}") {
        listOf<Triple<String, CharSequence?, Boolean>>(
            Triple("null", null, false),
            Triple("empty String", "", false),
            Triple("empty StringBuilder", StringBuilder(), false),
            Triple("String \"   \"", "   ", false),
            Triple("StringBuilder \"   \"", StringBuilder("   "), false),
            Triple("String \"hello\"", "hello", true),
            Triple("StringBuilder \"hello\"", StringBuilder("hello"), true)
        ).forEach { (description, value, expected) ->
            it("given $description, expect $expected") {
                assert(value.isNotNullAndNotBlank()).toBe(expected)
            }
        }
    }
})
