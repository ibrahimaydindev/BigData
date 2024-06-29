package com.ibrahim.bigdata.utils

class StringUtils {

    companion object {
        fun String.reverse(): String {
            return this@reverse
        }

        fun String.removeLastChar(): String {
            return this.substring(0, this.length - 1)
        }

        fun String.substring(startIndex: Int, endIndex: Int): String {
            return this.substring(startIndex, endIndex)
        }

        fun String.append(text: String): String {
            return this.plus(text)
        }

        fun String.removeFirstChar(): String {
            return this.substring(1, this.length)
        }

        fun String.upperCase(): String {
            return this.toUpperCase()
        }

        fun String.lowerCase(): String {
            return this.toLowerCase()
        }

        fun String.Capitalize(): String {
            return this.capitalize()
        }
    }

}