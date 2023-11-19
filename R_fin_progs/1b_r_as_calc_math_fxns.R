# Define a function to perform addition 
add <- function (x, y) {
return (x + y)
}
# Define a function to perform subtraction 
subtract <- function (x, y) {
return (x - y)
}
# Define a function to perform multiplication 
multiply <- function (x, y) {
return (x * y)
}
# Define a function to perform division 
divide <- function (x, y) {
if (y != 0) {
  return (x / y)
} else {
    return ("Cannot divide by zero!")
}
}

# Main program 
while(TRUE) {
  cat ("Select an operation:\n") 
  cat ("1. Add\n")
  cat ("2. Subtract\n")
  cat ("3. Multiply\n")
  cat ("4. Divide\n")
  cat ("5. Exit\n")
  choice <- as.integer(readline("Enter your choice: ")) 
  if (choice == 5) 
  {
    cat("Exiting the calculator.\n") 
    break
  }
  num1 <- as.numeric (readline ("Enter the first number: ")) 
  num2 <- as.numeric (readline ("Enter the second number: "))
  result <- switch(choice,
                   "1" = add(num1, num2),
                   "2" = subtract(num1, num2), 
                   "3" = multiply(num1, num2), 
                   "4" = divide(num1, num2))
  cat("Result: ", result, "\n")
}
