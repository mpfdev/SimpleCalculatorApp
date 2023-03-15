# Simple Calculator

This is a simple calculator program written in Java that can perform basic mathematical operations, such as addition, subtraction, multiplication, and division. The program reads user input from the console and uses a combination of string parsing and object-oriented design to evaluate the input and produce a result.

## Concepts Applied

- Object-oriented programming (OOP) principles
- Interfaces
- Exception handling and custom exceptions
- String parsing and manipulation
- Basic mathematical operations

## Technologies Used

- Java
- Git

## About

This project was developed as a learning exercise to practice core Java programming concepts, including OOP, interfaces, and exceptions. By completing this project, I gained a deeper understanding of how to design and implement object-oriented software systems, as well as how to handle and recover from errors in Java programs. Additionally, I learned how to use Git for version control and project management, which will be useful for future software development projects.

### How to Run

To run the Simple Calculator program, follow these steps:

1. Clone the repository to your local machine using Git or download the ZIP file and extract it.
2. Open a command prompt or terminal window and navigate to the project directory.
3. Compile the Java code using the command `javac *.java`.
4. Run the program using the command `java Main`.

You should now see a prompt in the console asking you to enter a mathematical expression. You can enter expressions using the standard format, such as "1 + 2" or "5 * 3.2". Press Enter to evaluate the expression, or type "exit" to exit the program.

### Project Structure

InputHandler.java
Main.java
Token.java
/ErrorHandling
ErrorHandling/ParseException.java
/Interface
Interface/IOperator.java
/Util
util/AdditionCalculator.java
util/DivisionCalculator.java
util/MultiplicationCalculator.java
util/OperatorFactory.java
util/SubtractionCalculator.java


The project has a simple directory structure.

The `.gitignore` file specifies files and directories that should be excluded from version control, while the `README.md` file contains information about the project and how to use it.

### Future Improvements

This Simple Calculator program is a basic implementation that can be expanded in many ways. Some possible improvements include:

- Adding support for more mathematical functions, such as logarithms, exponentials, and trigonometric functions.
- Implementing a graphical user interface (GUI) to make the program more user-friendly.

Overall, this Simple Calculator project was a great way to learn and practice core Java programming concepts, and I look forward to exploring more advanced topics in the future.
