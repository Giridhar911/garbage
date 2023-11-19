# Regression Program
# Load required libraries
library(foreign)
library(MASS)

# Generate random data for the example
set.seed(123) 
# Setting seed for reproducibility
n <- 200 
# Number of observations
data <- data.frame(
  GRE = round(runif(n, min = 200, max = 800)),
  GPA = round(runif(n, min = 1, max = 4) * 4, 2),
  Rank = sample(1:4, n, replace = TRUE),
  Admission = factor(sample(0:1, n, replace = TRUE))
)

# Display the first few rows of the dataset
print(head(data))

# Perform logistic regression
logit_model <- glm(Admission ~ GRE + GPA + Rank, data = data, family = binomial)

# Summary of the model
summary (logit_model)

# Predicting on the same dataset for simplicity
data$Predicted <- predict(logit_model, type = "response")

# Checking the model fit using a confusion matrix
conf_matrix <- table(data$Admission, data$Predicted > 0.5)
accuracy <- sum(diag(conf_matrix)) / sum(conf_matrix)
print(paste("Accuracy:", accuracy))

# Checking the model's coefficients
print(coef(logit_model))