package com.metria.sfv.system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * This crashes with:
 * java.lang.VerifyError: Bad <init> method call from inside of a branch
 * Exception Details:
 *   Location:
 *     com/metria/sfv/system/TestVerifyError.<init>()V @32: invokespecial
 '   Reason:
 *     Error exists in the bytecode
 *   ...
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticClass.class)
public class TestExtendsVerifyError extends ExtendedClass {

	@Test
	public void test() throws Exception {
		System.out.println("Hello!");
	}

}
