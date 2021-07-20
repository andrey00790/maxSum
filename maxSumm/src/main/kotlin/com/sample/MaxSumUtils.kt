import com.sample.MaxSumInfo

fun findSubarrayWithMaxSum(arr: IntArray): MaxSumInfo {
    var startIndex = 0
    var endIndex = 0
    var sum = 0
    var minusPosition = -1

    if (arr.isEmpty()) {
        return MaxSumInfo(0, 0, 0)
    } else {
        var maxSum = arr[0]

        for (i in 0.until(arr.size)) {
            sum += arr[i]

            if (sum > maxSum) {
                maxSum = sum
                startIndex = minusPosition + 1
                endIndex = i
            }

            if (sum < 0) {
                sum = 0
                minusPosition = i
            }
        }
        return MaxSumInfo(maxSum, startIndex, endIndex)
    }
}
