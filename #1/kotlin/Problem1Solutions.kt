package solutions.kotlin

class Problem1Solutions {

    companion object {

        fun solution1(number: Int): Int {
            var sum = 0

            for (i in 1..number - 1)
                if (isMultipleOf3(i) or isMultipleOf5(i))
                    sum = sum.plus(i)

            return sum
        }

        fun solution2(number: Int): Int {
            var sum = 0
            var i = 1

            while (i < number) {
                if (isMultipleOf3(i) or isMultipleOf5(i))
                    sum = sum.plus(i)

                i++
            }

            return sum
        }

        fun solution3(number: Int): Int {
            var sum = 0
            var i = 1

            do {
                if (isMultipleOf3(i) or isMultipleOf5(i))
                    sum = sum.plus(i)

                i++
            } while (i < number)

            return sum
        }

        fun solution4(number: Int): Int {
            return IntRange(1, number - 1).filter { it.isMultipleOf(3) or it.isMultipleOf(5) }.reduce {sum, multiple -> sum + multiple}
        }

        fun solution5(number: Int): Int {
            return IntRange(1, number - 1).filter { it.isMultipleOf(3) or it.isMultipleOf(5) }.sumBy { it }
        }

        fun Int.isMultipleOf(divisor: Int): Boolean {
            return this % divisor == 0
        }

        private fun isMultipleOf3(number: Int): Boolean {
            return isMultiple(number, 3)
        }

        private fun isMultipleOf5(number: Int): Boolean {
            return isMultiple(number, 5)
        }

        private fun isMultiple(number: Int, divisor: Int): Boolean {
            return number % divisor == 0
        }

    }

}