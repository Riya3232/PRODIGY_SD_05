# PRODIGY_SD_05 - Web Scraping

## 📌 Task Description
Task 5 of PRODIGY Infotech Software Development Internship.  
Create a program that extracts product information, such as names, prices, and ratings, from an e-commerce website and stores the data in a structured format like a CSV file.

---

## 📝 Features
- Connects to an online e-commerce site (Books to Scrape).
- Extracts:
  - Product Name
  - Price
  - Rating
- Stores data in **CSV format** (`products.csv`).

---

## 🚀 Technologies Used
- **Java**
- **Jsoup** (for web scraping)
- **CSV File Handling**

---

## ⚙️ Setup Instructions
### 1. Add Jsoup Library
- If using Maven, add in `pom.xml`:
```xml
<dependency>
  <groupId>org.jsoup</groupId>
  <artifactId>jsoup</artifactId>
  <version>1.16.1</version>
</dependency>
