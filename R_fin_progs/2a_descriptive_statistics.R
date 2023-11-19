# Load necessary datasets
data(mtcars) 
data(cars)

# Summary statistics for mtcars dataset
summary(mtcars)

# Structure of mtcars dataset
str(mtcars)

# Quartiles for mpg column in mtcars dataset
quantile(mtcars$mpg)
         
# Summary statistics for cars dataset
summary(cars)
         
# Structure of cars dataset
str(cars)
         
# Quartiles for speed column in cars dataset
quantile(cars$speed)