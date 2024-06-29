package com.ibrahim.bigdata.utils

class IntUtils {
    companion object {
        fun Int.isEven(): Boolean {
            return this % 2 == 0
        }

        fun Int.isOdd(): Boolean {
            return this % 2 != 0
        }

        fun Int.isPositive(): Boolean {
            return this > 0
        }

        fun Int.isNegative(): Boolean {
            return this < 0
        }

        fun Int.isZero(): Boolean {
            return this == 0
        }

        fun Int.isPrime(): Boolean {
            if (this < 2) return false
            for (i in 2..this / 2) {
                if (this % i == 0) return false
            }
            return true
        }

        fun Int.toDoubled(): Double {
            return this.toDouble()
        }

        fun Int.toFloated(): Float {
            return this.toFloat()
        }

        fun Int.toLonged(): Long {
            return this.toLong()
        }

        fun Int.toShorted(): Short {
            return this.toShort()
        }

        fun Int.toByted(): Byte {
            return this.toByte()

        }

        fun Int.toStringed(): String {
            return this.toString()
        }

        fun Int.toChared(): Char {
            return this.toChar()
        }

        fun Int.toBooled(): Boolean {
            return this == 1
        }

        fun Int.toHexed(): String {
            return this.toString(16)
        }

        fun Int.toOctaled(): String {
            return this.toString(8)
        }

        fun Int.toBinaried(): String {
            return this.toString(2)
        }
    }
}