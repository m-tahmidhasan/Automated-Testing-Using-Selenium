# Automated Testing Using Selenium (Java + TestNG + Maven)

This project demonstrates automated testing of a web-based **Login and Registration System** using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**. 

---

## 🚀 Technologies Used
- Java (JDK 21)
- Selenium WebDriver
- TestNG
- Apache Maven
- Google Chrome & ChromeDriver
- Eclipse IDE

---

## ✅ Test Scenarios Covered
- ✅ Login Automation Test
- ✅ User Registration Automation Test
- ✅ End-to-End Test (Register + Login)

---

## 📁 Project Structure

```
selenium-web-testing-java/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── (reserved for future main application code)
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── sqt/
│                   └── tests/
│                       ├── LoginTest.java
│                       ├── RegisterTest.java
│                       └── EndToEndTest.java
│
├── drivers/
│   └── chromedriver.exe
│
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md
```


---

## ⚙️ Setup & Run Instructions

### 1️⃣ Install Required Software
- Install **Java JDK 21**
- Install **Eclipse IDE**
- Install **Google Chrome**

---

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/automated-testing-using-selenium.git

```
---

3️⃣ Configure ChromeDriver

- Download ChromeDriver matching your Chrome version

- Place it inside the drivers folder

- Update the driver path in your test code if required

4️⃣ Install Dependencies

Maven will automatically download all required dependencies from pom.xml.

5️⃣ Run the Tests

- You can run tests using:

  ✅ TestNG from Eclipse
  or

  ✅ Maven command:
  ```bash
  mvn test
   ```

## 📊 Output

- Automatically tests form submission

- Validates login and registration

- Confirms successful dashboard redirection
