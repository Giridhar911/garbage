# Load necessary libraries
library(readxl)
library(XML)

# Read an Excel data sheet
excel_data <- read_excel("path/to/your/excel_file.xlsx", sheet = "Sheet1")

# Read an XML dataset
xml_data <- xmlParse("path/to/your/xml_file.xml")

# Access XML data
root <- xmlRoot(xml_data)

# Depending on your XML structure, you can navigate and
# extract data from the 'root' element
# Example of writing to an XML file (creating a simple example)
new_xml <- newXMLNode("root")
newXMLNode("data", "Some text data", parent = new_xml)
saveXML(new_xml, "path/to/output/xml_output.xml")