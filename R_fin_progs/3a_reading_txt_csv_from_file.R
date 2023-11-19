# Load necessary libraries
library(readr)

# Read data from a CSV file on disk
csv_data <- read_csv("/cloud/project/R_Lab_exps/exp_03/file.csv")

# Read data from a TXT file on disk (assuming tab-delimited)
txt_data <- read_delim("/cloud/project/R_Lab_exps/exp_03/file.txt", delim = "\t")

# Read data from a CSV file from a URL
url <- "https://example.com/data.csv"
web_csv_data <- read_csv(url)

# Read data from a TXT file from a URL (assuming tab-delimited)
web_txt_data <- read_delim(url, delim = "\t")

# Write data to a CSV file in a specific location
write_csv(csv_data, "/cloud/project/R_Lab_exps/exp_03/csv_output.csv")

# Write data to a TXT file in a specific location
write_delim(txt_data, "/cloud/project/R_Lab_exps/exp_03/txt_output.txt", delim = "\t")