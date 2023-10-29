**HERE ARE ALL MY NOTES FROM ALL THE STUDENT LESSONS COMPILED INTO ONE MARKDOWN FILE**







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