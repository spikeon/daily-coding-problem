package us.flynndev.daily

import java.util.ArrayList

object Week1 {

    fun day1(list: ArrayList<Int>, k: Int): Boolean {
        for (current in list) if (list.contains(k - current)) return true
        return false
    }

    fun day2(numbers: ArrayList<Int>): ArrayList<Int> {
        val out = ArrayList<Int>()
        for (i in numbers.indices) {
            var current = 1
            for ((i2, value) in numbers.withIndex()) {
                if (i == i2) continue
                current *= value
            }
            out.add(current)
        }
        return out
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(day1(arrayListOf(10, 15, 3, 7), 17))
        println(day2(arrayListOf(1,2,3,4,5)))
    }
}
