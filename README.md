## Calculator Application ##

The calculator application allows end users to perform the following basic operations:
* Addition
* Subtraction
* Multiplication
* Division

Operator (+,-,*,/) and operands (2.3 4.7) are requested as command line arguments.
The result of the operation is printed to the console. 
The application can handle negative numbers also.

### Software versions
* JDK: 18
* Gradle: 8.4

### Run the main Calculator application
Provide required inputs via command line requests
```bash
Executing ':Calculator.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :Calculator.main()

Enter one of the following operations: +, -, *, / : +
Enter the operands separated by space e.g., 2.5 3 8.8 : 6.78 8.99
The result is: 15.77
```