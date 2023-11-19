# Should install.packages("ggplot2")
library(ggplot2)

# Should install.packages("corrplot")
library(corrplot)

# Should install.packages("stats")
library(stats)

# Load the iris dataset
data(iris)

# a. Find the correlation matrix
cor_matrix <- cor(iris[, -5]) 

# Exclude the species column
# Print the correlation matrix
print(cor_matrix)

# b. Plot the correlation plot
corrplot(cor_matrix, method = "color")

# c. Analysis of Variance (ANOVA)

# Perform ANOVA for Sepal.Length based on Species
anova_result <- aov(Sepal.Length ~ Species, data = iris)

# Print ANOVA summary
print (summary(anova_result))