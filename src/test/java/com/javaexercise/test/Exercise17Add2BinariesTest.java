package com.javaexercise.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javaexercise.dev.Add2Binaries;

public class Exercise17Add2BinariesTest {

	@Test
	public void testAdd2Binaries() {
		assertEquals(101, Add2Binaries.add(10, 11));
	}

}
