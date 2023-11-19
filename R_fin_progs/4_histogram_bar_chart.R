# Graph Plotting
# Generate sample data
set.seed(123)
data <- c(rnorm(50), rnorm(10, mean = 5), rnorm(5, mean = -5))

# Plotting
par(mfrow = c(2, 3)) 
# Set up a 2x3 grid for plots
# Box and Scatter Plot
boxplot(data, main = "Box Plot")
plot(data, pch = 16, main = "Scatter Plot")

# Find Outliers using Plot
boxplot(data, outline = TRUE, main = "Outliers Plot")

# Histogram
hist(data, main = "Histogram")

# Bar Chart
bar_data <- table(round(data))
barplot(bar_data, main = "Bar Chart")

# Pie Chart
pie(bar_data, main = "Pie Chart")