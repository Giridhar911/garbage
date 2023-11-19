# Clustering Model
# Load required libraries
library(ggplot2) 

# For data visualization
# Generate random data for the example
set.seed(123) 

# Setting seed for reproducibility
n <- 200
data <- data.frame(
  X = rnorm(n),
  Y = rnorm(n)
)

# Perform k-means clustering
num_clusters <- 3
kmeans_result <- kmeans(data, centers = num_clusters)

# Add cluster labels to the data
data$Cluster <- as.factor(kmeans_result$cluster)

# Plot the clustered data using ggplot2
print(ggplot(data, aes(x = X, y = Y, color = Cluster)) +
        geom_point() +
        scale_color_brewer(palette = "Set1") +
        labs(title = "K-Means Clustering"))