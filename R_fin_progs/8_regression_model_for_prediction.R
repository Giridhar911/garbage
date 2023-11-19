# Regression Model for Prediction
# Generate random data for the example
set.seed(123) 

# Setting seed for reproducibility
n <- 200 

# Number of observations
data <- data.frame(
  GRE = round(runif(n, min = 200, max = 800)),
  GPA = round(runif(n, min = 1, max = 4) * 4, 2),
  Rank = sample(1:4, n, replace = TRUE),
  ContinuousVar = runif(n, min = 10, max = 50),
  Admission = factor(sample(0:1, n, replace = TRUE))
)

# Display the first few rows of the dataset
print(head(data))

# Split the data into training and testing sets
set.seed(123) # Setting seed for reproducibility
trainIndex <- sample(n, n * 0.7) # 70% of data for training
trainData <- data[trainIndex, ]
testData <- data[-trainIndex, ]

# Perform logistic regression on the training data
logit_model <- glm(Admission ~ GRE + GPA + Rank + ContinuousVar, data = trainData, family = binomial)

# Predict admission on the testing data
predictions <- predict(logit_model, newdata = testData, type = "response")

# Convert probabilities to binary predictions (0 or 1)
predicted_classes <- ifelse(predictions > 0.5, 1, 0)

# Confusion matrix to evaluate model performance
conf_matrix <- table(testData$Admission, predicted_classes)
accuracy <- sum(diag(conf_matrix)) / sum(conf_matrix)

print(paste("Accuracy:", accuracy))