# Multiple Regression Program
# Load required libraries
library(foreign)

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

# Perform logistic regression
logit_model <- glm(Admission ~ GRE + GPA + Rank + ContinuousVar, data = data, family = binomial)

# Summary of the model
summary(logit_model)

# Checking the model's coefficients
print(coef(logit_model))