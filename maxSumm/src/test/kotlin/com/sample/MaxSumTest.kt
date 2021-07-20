package com.sample

import findSubarrayWithMaxSum
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MaxSumTest {
    @ParameterizedTest
    @MethodSource("successfulResponse")
    fun `Should be successful found max sum`(array: IntArray, maxSumInfo: MaxSumInfo) {
        assertEquals(maxSumInfo, findSubarrayWithMaxSum(array))
    }

    private companion object {
        @JvmStatic
        fun successfulResponse(): Array<Array<out Any>> = arrayOf(
            arrayOf(
                intArrayOf(10, -3, -12, 8, 42, 1, -7, 0, 3),
                MaxSumInfo(51, 3, 5)
            ),
            arrayOf(
                intArrayOf(31, -41, 59, 26, -53, 58, 97, -93, -23, 84),
                MaxSumInfo(187, 2, 6)
            ),
            arrayOf(
                intArrayOf(),
                MaxSumInfo(0, 0, 0)
            ),
            arrayOf(
                intArrayOf(1),
                MaxSumInfo(1, 0, 0)
            ),
            arrayOf(
                intArrayOf(-1,-1,-1),
                MaxSumInfo(-1, 0, 0)
            ),
            arrayOf(
                intArrayOf(-1,0,-1),
                MaxSumInfo(0, 1, 1)
            ),
            arrayOf(
                intArrayOf(-1,1,-1),
                MaxSumInfo(1, 1, 1)
            )
        )
    }
}
