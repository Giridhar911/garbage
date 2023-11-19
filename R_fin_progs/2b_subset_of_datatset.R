# Load iris dataset
data(iris)

# Subset rows where Sepal.Length is greater than 5.0
subset_iris <- subset(iris, Sepal.Length > 5.0)

# Display the first few rows of the subsetted dataset
head(subset_iris)

# Aggregate the mean Sepal.Length for each Species in the iris dataset
agg_result <- aggregate(Sepal.Length ~ Species, data = iris, FUN = mean)

# Display the aggregated results
agg_result