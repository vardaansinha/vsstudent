**HERE ARE ALL MY NOTES FROM ALL THE STUDENT LESSONS COMPILED INTO ONE MARKDOWN FILE**


**UNIT 2 IMPORTANT NOTES:**

**2.1 Learning Objective - Relationship between Class and Object:**
- In object-oriented programming, a class is a blueprint or template for creating objects.
- An object is an instance of a class.
- The class defines the structure and behavior of the object.
- Objects created from the same class share the same characteristics but can have different data.

**2.2 Learning Objective - Calling Constructors:**
- Constructors are special methods used to create objects.
- They have the same name as the class and can be called to create objects.
- Constructors can be called without parameters or with parameters, allowing you to initialize object data during creation.
- When calling a constructor, you should specify the correct types of parameters based on the constructor's signature.
- For example, `new MyClass()` calls a parameterless constructor, and `new MyClass(param1, param2)` calls a constructor with parameters `param1` and `param2`.

**2.3 Learning Objective - Calling Non-Static Void Methods (Without Parameters):**
- In Java, methods are functions defined within a class that perform specific tasks.
- Non-static void methods do not return a value and are called using an object.
- You can call such methods without passing any parameters.
- For example, if you have an object `myObject` of class `MyClass`, you can call `myObject.myMethod()` to execute a non-static void method.

**2.4 Learning Objective - Calling Non-Static Void Methods (With Parameters):**
- Non-static void methods can also accept parameters.
- When calling these methods, you need to pass the required parameters as specified in the method's signature.
- For example, if you have a method `myMethod` that takes parameters `param1` and `param2`, you can call it using `myObject.myMethod(param1, param2)`.

**2.5 Learning Objective - Calling Non-Static Non-Void Methods:**
- Non-static non-void methods return a value when executed.
- These methods may or may not accept parameters.
- When calling such methods, you can capture the return value.
- The return type of the method should match the type of variable used to store the result.
- For example, `int result = myObject.calculateSum(x, y)` captures the result of a non-static non-void method.

**2.6 Learning Objective - String Class Methods:**
- The String class in Java is used to work with text.
- You can create String objects and perform various operations using String methods.
- String methods allow you to manipulate and analyze text data, such as finding the length of a string, concatenating strings, and more.

**2.7 Learning Objective - String Class (More API and Packages Centric):**
- Java's `java.lang` package contains essential classes, including the String class.
- When working with the String class, you can handle exceptions like `IndexOutOfBoundsException` when accessing characters beyond the string's length.
- The `java.lang` package provides core functionality and is automatically imported into Java programs.

**2.8 Learning Objective - Wrapper Classes (Integer and Double):**
- Wrapper classes are used to work with primitive data types as objects.
- Integer and Double are examples of wrapper classes for int and double data types.
- You can create Integer and Double objects, and call their respective methods to perform operations like conversion and manipulation.

**2.9 Learning Objective - Calling Static Methods and Math Class:**
- Static methods belong to a class rather than a specific object.
- You can call static methods using the class name.
- The Math class in Java provides a set of mathematical functions and constants.
- You can call methods from the Math class to perform mathematical operations.

<br>
<br>


**UNIT 3 IMPORTANT NOTES:**

**3.1 Learning Objective - Evaluate Boolean Expressions with Relational Operators:**
- In programming, we often use Boolean expressions to make decisions.
- These expressions involve the use of relational operators to compare values.
- Types of Relational Operators include:
    - Equal to: `==`
    - Not Equal to: `!=`
    - Greater than: `>`
    - Less than: `<`
    - Greater than or equal to: `>=`
    - Less than or equal to: `<=`
- These operators return either `true` or `false` based on the comparison result.

**3.2, 3.3, and 3.4 Learning Objectives - Conditional Statements:**
- Conditional statements are used to represent branching logical processes in code.
- Nested if-else statements allow you to create more complex decision trees.
- Compound boolean expressions combine multiple conditions using logical operators:
    - `&&` (logical AND) returns `true` if both conditions are `true`.
    - `||` (logical OR) returns `true` if at least one condition is `true`.
- Short-circuited evaluation means that if a logical expression can be determined with only the evaluation of the first part, the second part may not be evaluated. This can be used for optimization.

**3.6 Learning Objective - De Morgan's Law:**
- De Morgan's Law is a set of rules that help simplify and understand complex boolean expressions.
- It allows us to rewrite expressions involving logical NOT, AND, and OR operators.
- The rules state that:
    - NOT (A AND B) is equivalent to (NOT A) OR (NOT B).
    - NOT (A OR B) is equivalent to (NOT A) AND (NOT B).

**3.7 Learning Objective - Comparing Object References:**
- In programming, you often need to compare object references to determine if they refer to the same object.
- This is done using boolean expressions.
- The `==` operator is used for object reference comparison. It checks if two references point to the same object in memory.
- It's important to note that `==` compares the memory address, not the content of the objects.
- For comparing the content of objects, especially with Strings, you should use `.equals()` or `.compareTo()` methods instead of the `==` operator.