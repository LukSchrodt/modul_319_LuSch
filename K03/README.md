### Exceptions
- Exceptions are errors in the program that occur either during compiling error or due to a problem later in the program, while running. For example a user input.

- Checked exceptions: Checked exceptions are the programmers fault and happen during compiling of the program. This can be a simple syntax error.
  - Fully checked: Fully checked exceptions are exceptions where all child classes are checked too.
  - partially checked: Partially checked exceptions are exceptions where some of the child classes are unchecked errors.

- Unchecked exceptions: Are exceptions that **do not** happen during compile time. They need to be catch or handled by the developer. A good example would be a wrong user input or a division by 0.

### Throws 
- Throws is something of an argument you can give to a method in Java. It declares that this method will throw an exception. If caught right the program will keep running and not crash.

### Throw
- The throw statement is used to create a custom exception. This can be used, for example, to give a custom error output on a wrong user input.

### Try-Catch-Final
- Try is first of those three statement. Its usually put around something that might throw an error and cant be handled in a different way. It's important to not over use it. Many exceptions can simply be removed with better programming.
- Catch is used to throw an exception if in the try block an exception occurs. You need to specify what kind of error should be caught.
- Finally is the last action that will always be done after the try-catch statement.

