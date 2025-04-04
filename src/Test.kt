package org.kotlin.unlimited

fun main() {
    // Sudoku Checker Tests
    checkSudoku(
        name = "Valid Sudoku",
        board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        ),
        expectedResult = true
    )

    checkSudoku(
        name = "Invalid Sudoku (Duplicate in Row)",
        board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '7') // Duplicate 7 in last row
        ),
        expectedResult = false
    )

    checkSudoku(
        name = "Invalid Sudoku (Duplicate in Column)",
        board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '5', '-', '7', '9') // Duplicate 5 in second column
        ),
        expectedResult = false
    )

    checkSudoku(
        name = "Invalid Sudoku (Duplicate in 3x3 Box)",
        board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '5', '8', '-', '-', '7', '9') // Duplicate 5 in first 3x3 box
        ),
        expectedResult = true
    )

    checkSudoku(
        name = "Valid 4x4 Sudoku",
        board = arrayOf(
            charArrayOf('1', '2', '3', '4'),
            charArrayOf('3', '4', '1', '2'),
            charArrayOf('2', '1', '4', '3'),
            charArrayOf('4', '3', '2', '1')
        ),
        expectedResult = true
    )

    checkSudoku(
        name = "Invalid 4x4 Sudoku",
        board = arrayOf(
            charArrayOf('1', '2', '3', '4'),
            charArrayOf('3', '4', '1', '2'),
            charArrayOf('2', '1', '4', '3'),
            charArrayOf('4', '3', '2', '4')
        ),
        expectedResult = false
    )

    checkSudoku(
        name = "Valid 1x1 Sudoku",
        board = arrayOf(charArrayOf('1')),
        expectedResult = true
    )

    checkSudoku(
        name = "Invalid 1x1 Sudoku",
        board = arrayOf(charArrayOf('1','1')),
        expectedResult = false
    )

    checkSudoku(
        name = "Empty Sudoku",
        board = arrayOf(
            charArrayOf('-', '-', '-'),
            charArrayOf('-', '-', '-'),
            charArrayOf('-', '-', '-')
        ),
        expectedResult = false
    )
}

fun checkSudoku(name: String, board: Array<CharArray>, expectedResult: Boolean) {
    val result = isValidSudoku(board)
    if (result == expectedResult) {
        println("success - $name")
    } else {
        println("failed - $name")
    }
}

