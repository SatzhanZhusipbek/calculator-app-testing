# Calculator App Testing

This project is designed to test the functionalities of the `Calculator-1.0.jar` library using **JUnit 5** in a Maven-based Java application.

## 📋 **Project Structure**

```
calculator-app-testing/
│
├── src/
│   ├── main/              # Main application code (if applicable)
│   ├── test/              # Unit tests for Calculator methods
│
├── libs/                  # External dependencies
│   └── Calculator-1.0.jar
│
├── pom.xml                # Maven configuration file
├── README.md              # Project documentation
```

---

### ✅ **Prerequisites**

- Java Development Kit (JDK) 11+
- Apache Maven 3.6+
- IntelliJ IDEA (or another preferred IDE)

### 📦 **Running tests**
**How to run tests:**

```
mvn test
```

---

## **Testing**

Each calculator method has its dedicated test class:

- `CalculatorSumTest` - Tests `sum()` method
- `CalculatorSubTest` - Tests `sub()` method
- `CalculatorMultTest` - Tests `mult()` method
- `CalculatorDivTest` - Tests `div()` method, including division by zero
- `CalculatorTangentTest` - Tests trigonometric functions (`tg`, `ctg`, `cos`, `sin`)
- `CalculatorSignTest` - Tests `isPositive()` and `isNegative()`
- `TimeoutParallelExecutionTest` - Demonstrates parallel execution using `Timeout.sleep()`
These are only some of the tests that are present in the project

### 🔗 **Parallel Execution Configuration**

Configuration settings for parallel execution are in `junit-platform.properties` in `src/test/resources/`:


