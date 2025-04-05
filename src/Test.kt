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
        name = "Valid Sudoku 3x3 ",
        board = arrayOf(
            charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
            charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
            charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
            charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
            charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
            charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
            charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
            charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
            charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
        ),
        expectedResult = true
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
            charArrayOf('-', '-', '6', '5', '8', '-', '-', '7', '9') // Duplicate 5 in first 3x3 box
        ),
        expectedResult = false
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

    // Valid 16x16 Sudoku
    checkSudoku(
        name ="Valid 16x16 Sudoku",
        board = arrayOf(
        charArrayOf('-', '4', '-', '-', '-', '-', '-', '-', '-', '-', 'D', '-', '-', '7', '-', '2'),
        charArrayOf('-', '-', '6', '-', '-', '3', '-', '-', '4', '-', '-', '-', 'F', '-', '-', '-'),
        charArrayOf('-', '-', '-', '1', '-', '-', '9', '-', '-', '-', '-', '5', '-', '-', 'C', '-'),
        charArrayOf('8', '-', '-', '-', 'A', '-', '-', '-', '-', '-', '-', '-', '-', '5', '-', '-'),
        charArrayOf('-', '-', '-', '7', '-', '-', '-', 'B', '-', '8', '-', '-', '-', '-', '-', '3'),
        charArrayOf('-', '2', '-', '-', '-', '-', '5', '-', '-', '-', '1', '-', '-', '-', '-', '-'),
        charArrayOf('9', '-', '-', '-', '-', '-', '-', '3', '-', '-', '-', '-', '-', '6', '-', '-'),
        charArrayOf('-', '-', '5', '-', '-', '8', '-', '-', '-', 'E', '-', '-', '-', '-', '-', '9'),
        charArrayOf('-', '-', '-', '-', '6', '-', '-', '-', '2', '-', '-', '-', '-', '-', 'A', '-'),
        charArrayOf('-', '-', '3', '-', '-', '-', '-', '-', '-', '-', '-', '7', '-', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '-', '1', '-', '-', '-', '9', '-', '-', '8', '-', '-', '-'),
        charArrayOf('4', '-', '-', '-', '-', 'F', '-', '7', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', 'B', '-', '-', '-', '-', '-', '-', '-', '3', '-', '-', '-', '1', '-'),
        charArrayOf('-', '8', '-', '-', '-', '-', 'C', '-', '-', '-', '-', '-', '5', '-', '-', '-'),
        charArrayOf('-', '-', '-', 'E', '-', '-', '-', '1', '-', '-', '-', '9', '-', '-', '-', '-'),
        charArrayOf('1', '-', '-', '5', '-', '-', '-', '-', '-', '-', '-', '-', '-', '3', '-', '-')
        ),
         expectedResult = true
    )

    // Invalid 16x16 Sudoku (with repetition in the first row)
    checkSudoku(
        name ="Valid 16x16 Sudoku",
        board = arrayOf(
        charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '1'),
        charArrayOf('2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1'),
        charArrayOf('3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2'),
        charArrayOf('4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3'),
        charArrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
        charArrayOf('6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5'),
        charArrayOf('7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6'),
        charArrayOf('8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7'),
        charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
        charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9'),
        charArrayOf('B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A'),
        charArrayOf('C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B'),
        charArrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),
        charArrayOf('E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D'),
        charArrayOf('F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'),
        charArrayOf('G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
        ),
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

