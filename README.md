# automation-framework
TestNG Practice
# TestNG Practice Project

This repository is for practicing and experimenting with the TestNG framework. It's not a full application, but a collection of tests designed to demonstrate different TestNG features for Selenium automation testing.

## About this Project

The main goal of this project is to learn and explore key concepts in TestNG, such as:

* *Basic Test Structure:* Creating and running test methods.
* *Annotations:* Using @Test, @Before..., @After..., and other annotations.
* *Test Grouping:* Organizing tests into groups (e.g., smoke, regression) and executing specific groups.
* *Parallel Execution:* Running tests in parallel across multiple browsers or threads.
* *Parameterization:* Passing data to test methods using @Parameters and testng.xml.
* *Data Providers:* Feeding test data from DataProvider methods.
* *Dependency Testing:* Creating dependent tests using dependsOnMethods or dependsOnGroups.
* *Assertions:* Using hard and soft assertions.
* *Cross-Browser Testing:* Running the same test suite on different browsers (e.g., Chrome, Firefox).





## Usage

You can run the tests by:

1.  *Directly from the IDE:* Right-click on test files or the testng.xml file and select "Run as TestNG Test".
2.  *Using Maven:* Open a terminal in the project directory and run mvn test. (Assuming you've configured Maven).

## Key Features Explored

Here’s a summary of the TestNG concepts demonstrated in this project:

* testng.xml Configuration: Example configurations for managing suites, tests, and parameters.
* @Test(groups = {"group1", "group2"}): Examples of test grouping.
* Parallel Execution (parallel="methods"): Demonstrated in testng.xml.
* Parameterized Testing (@Parameters): Example test method.
* DataProvider usage: Example with external data source (optional).
* Assertion Examples: Hard and soft assertion usage.
* Test Sequencing and Dependencies: Demonstrated using TestNG attributes.

Feel free to explore the tests and configuration files.
