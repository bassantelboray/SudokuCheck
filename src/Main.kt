package org.kotlin.unlimited

fun main() {
    val validBoard = Array(5) { CharArray(5) }

    println(isValidSudoku(validBoard))

}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val n = board.size
    val subgridSize = Math.sqrt(n.toDouble()).toInt()

    // Check rows
    for (row in board) {
        if (!isValidUnit(row)) {
            return false
        }
    }

    // Check columns
    for (col in 0 until n) {
        val column = CharArray(n)
        for (row in 0 until n) {
            column[row] = board[row][col]
        }
        if (!isValidUnit(column)) {
            return false
        }
    }

    // Check subgrids
    for (i in 0 until n step subgridSize) {
        for (j in 0 until n step subgridSize) {
            val subgrid = CharArray(n)
            var index = 0
            for (row in i until i + subgridSize) {
                for (col in j until j + subgridSize) {
                    subgrid[index++] = board[row][col]
                }
            }
            if (!isValidUnit(subgrid)) {
                return false
            }
        }
    }

    return true
}

fun isValidUnit(unit: CharArray): Boolean {
    val seen = mutableSetOf<Char>()
    for (value in unit) {
        if (value != '-') {
            if (seen.contains(value)) {
                return false
            }
            seen.add(value)
        }
    }
    return true
}
