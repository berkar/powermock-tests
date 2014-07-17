Powermock tests
===============

I have some problems with "special cases" with powermock. This is some test cases to expand around the subject.

In the pom.xml there are properties for JDK version 1.6, 1.7 and 1.8, select which one that is wanted and run:

mvn clean test

1.6 is ok, but 1.7 and 1.8 gives me:

java.lang.VerifyError: Bad <init> method call from inside of a branch ...

There are 2 test cases available:

TestExtendsVerifyError - Remove "extends ..." makes it work (or take away PrepareForTest)!

TestInnerClassVerifyError - Anything but "private" on inner class works (or take away PrepareForTest)!
