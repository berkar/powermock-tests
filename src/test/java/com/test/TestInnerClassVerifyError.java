package com.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * This crashes with:
 * java.lang.VerifyError: Bad <init> method call from inside of a branch
 * Exception Details:
 *   Location:
 *     com/test/TestInnerClassVerifyError$MyInnerClass.<init>(Lcom/test/TestInnerClassVerifyError;Lcom/test/TestInnerClassVerifyError$1;)V @38: invokespecial
 '   Reason:
 *     Error exists in the bytecode
 *   ...
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticClass.class)
public class TestInnerClassVerifyError {

	private class MyInnerClass {
	}

	@Before
	public void setup() {
		new MyInnerClass();
	}

	@Test
	public void test() throws Exception {
		System.out.println("Hello!");
	}

}
