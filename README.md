# Automating-Automation-Exercise-Website
Automation Exercise is a Full-Fledged practice website for Automation Engineers, All QA engineers can use this website for automation practice and API testing either they are at beginner or advance level. This is for everybody to help them brush up their automation skills.

# Overview
This project is an automation testing framework developed using Java, Selenium, Cucumber, TestNG, and Apache POI. The framework is designed to provide robust, scalable, and maintainable automated tests for web applications.

# Technologies Used
- Java: The primary programming language used for developing the test scripts.
- Selenium: A web automation tool used for automating web application testing.
- Cucumber: A tool that supports Behavior-Driven Development (BDD) by allowing test scenarios to be written in plain language.
- TestNG: A testing framework used for organizing and executing tests, managing test configurations, and generating reports.
- Apache POI: A library for reading and writing Microsoft Office files, used for handling test data in Excel files.

# Project Structure
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       ├── java
│       │   ├── stepdefinitions  // Contains step definitions for Cucumber scenarios
│       │   ├── runners          // Contains test runner classes for TestNG and Cucumber
│       │   ├── pages            // Page Object Model (POM) classes representing web pages
│       │   ├── utils            // Utility classes such as Data Providers, Helpers, etc.
│       └── resources
│           ├── features         // Cucumber feature files
│           ├── testdata         // Test data files (Excel)
├── pom.xml                      // Maven POM file for managing dependencies
└── README.md                    // Project documentation


# Key Features
## 1. Behavior-Driven Development (BDD)
- Implemented using Cucumber, which allows writing test scenarios in plain language (Gherkin).
- Promotes collaboration between developers, testers, and non-technical stakeholders.
## 2. Data-Driven Testing
- Utilized Apache POI for handling test data from Excel files.
- Data Providers in TestNG are used to run test cases with multiple sets of data.
## 3. Parameterized Tests
- Test cases are designed to be reusable with different sets of input data using TestNG’s @Parameters and @DataProvider annotations.
## 4. Prioritized Testing
- Test cases are prioritized using TestNG’s @Priority annotation to ensure critical test cases are executed first.

# Best Practices
- Modular Design: Test code is organized into reusable components such as page objects and utility classes.
- Separation of Concerns: Business logic, test data, and test scripts are separated for better maintainability.
- Continuous Integration (CI): The framework is designed to integrate with CI tools like Jenkins for automated test execution.
- Reporting: Detailed test execution reports are generated using TestNG, providing insights into test results.


# Getting Started
## Prerequisites
- Java 8 or higher
- Maven (for dependency management)
- TestNG Plugin (for running TestNG tests)
## Installation
- Clone the repository:
`git clone https://github.com/your-repo/automation-project.git`
- Navigate to the project directory:
`cd automation-project`
- Install the dependencies:
`mvn clean install`
## Running Tests
- Running All Tests:
`mvn test`
## Running Specific Tests:
- Use the TestNG XML file to run specific test groups:
`mvn test -DsuiteXmlFile=testng.xml`
## Contributing
- If you'd like to contribute to this project, please follow these steps:

- Fork the repository.
- Create a feature branch.
- Commit your changes.
- Push to the branch.
- Create a Pull Request.
## License
- This project is licensed under the MIT License - see the LICENSE file for details.

## Contact
For any inquiries or issues, please contact officialpmk@gmail.com.






















