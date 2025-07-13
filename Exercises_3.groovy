import java.util.Scanner
// **************** 7/12/2025
'''
6.\tWrite an if-else block to print different messages based on whether a number is positive, negative, or zero.
'''

// Import the Scanner class to allow reading input from the user
def scanner = new Scanner(System.in) // Create a Scanner object for reading from standard input (keyboard)

// Read an integer from the user and store it in the variable 'num'
def num = scanner.nextInt()

// Start an if-else block to check whether the number is positive, zero, or negative
if (num > 0) {
    // This block runs if 'num' is greater than 0
    print("hey, it's greater than 0")
} else if (num == 0) {
    // This block runs if 'num' is exactly 0
    print("hey, it's zero")
} else {
    // This block runs if 'num' is less than 0
    print("Your number is negative")
}

