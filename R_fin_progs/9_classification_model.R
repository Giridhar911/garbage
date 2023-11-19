# Classification Model
# Load required libraries
library(caret)
library(e1071) 
# For the SVM classifier (you can choose other classifiers as well)
# Load the iris dataset
data(iris)

# Split the data into training and testing sets
set.seed(123)
trainIndex <- createDataPartition(iris$Species, p = 0.7, list = FALSE)
trainData <- iris[trainIndex, ]
testData <- iris[-trainIndex, ]

# Choose a classifier (Support Vector Machine in this case)
classifier <- svm(Species ~ ., data = trainData)

# Predict species on the testing data
predictions <- predict(classifier, newdata = testData)

# Confusion matrix to evaluate classifier performance
conf_matrix <- table(predictions, testData$Species)
accuracy <- sum(diag(conf_matrix)) / sum(conf_matrix)
print(paste("Accuracy:", accuracy))