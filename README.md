Powermock tests
===============

I have some problems with "special cases" with powermock. This is some test cases to expand around the subject.

In the pom.xml there are properties for JDK version 1.6, 1.7 and 1.8, select which one that is wanted and run:

mvn clean test

1.6 is ok, but 1.7 and 1.8 gives me:

java.lang.VerifyError: Bad <init> method call from inside of a branch
Exception Details:
  Location:
    com/metria/sfv/system/TestVerifyError.<init>()V @32: invokespecial
  Reason:
    Error exists in the bytecode
  ...
