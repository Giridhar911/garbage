# Define calculator functions
add <- function(x, y) { 
  return(x + y)
}
subtract <- function(x, y) { 
  return(x - y)
}
Multiply <- function(x, y) {
  return(x * y) 
}
divide <- function(x, y) { 
  if (y != 0) {
  return(x / y)
} 
  else {
  return("Cannot divide by zero!")
}
}

# Specify the file path to save and load the R objects
save_file <- "calculator_functions.rds"

# Save the functions as R objects
saveRDS(list(add = add, subtract = subtract, multiply = multiply, divide = divide), file = save_file) 
cat("Calculator functions saved to:", save_file, "\n")

# Load the saved R objects
loaded_functions <- readRDS(save_file)

# Now you can use the loaded functions
result_add <- loaded_functions$add (5, 3)
result_subtract <- loaded_functions$subtract(10, 3)
cat ("Result of addition:", result_add, "\n")
cat ("Result of subtraction:", result_subtract, "\n")