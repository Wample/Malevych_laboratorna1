fun main() {
    // 1) (a + b - c) * 2 / 3 % 5 при a = 10, b = 20, c = 5
    val a1 = 10
    val b1 = 20
    val c1 = 5
    val result1 = ((a1 + b1 - c1) * 2 / 3) % 5
    println("Result 1: $result1")

    // 4) ((a + b) - c) * d / 2 + 10 % 3 - (c and d) при a = 5; b = 3; c = 2; d = 4
    val a4 = 5
    val b4 = 3
    val c4 = 2
    val d4 = 4
    val result4 = (((a4 + b4) - c4) * d4 / 2) + (10 % 3) - (c4 and d4)
    println("Result 4: $result4")

    // 7) (a + b + c - d) * 2 / 3 % 5 + c при a = 7, b = 120, c = 5, d = 17
    val a7 = 7
    val b7 = 120
    val c7 = 5
    val d7 = 17
    val result7 = (((a7 + b7 + c7 - d7) * 2 / 3) % 5) + c7
    println("Result 7: $result7")

    // 11) (2a + 3b - 4c) * 12 / a % 3 при a = 7, b = 120, c = 15
    val a11 = 7
    val b11 = 120
    val c11 = 15
    val result11 = ((2 * a11 + 3 * b11 - 4 * c11) * 12 / a11) % 3
    println("Result 11: $result11")

    // 17) (19a + 3b - 2c * d) * d / 3 % 5 + c при a = 7, b = 120, c = 15, d = 17
    val a17 = 7
    val b17 = 120
    val c17 = 15
    val d17 = 17
    val result17 = ((19 * a17 + 3 * b17 - 2 * c17 * d17) * d17 / 3) % 5 + c17
    println("Result 17: $result17")
}
