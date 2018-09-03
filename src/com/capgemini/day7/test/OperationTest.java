package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Operations;

import static org.junit.Assert.assertEquals;




class OperationsTest {

	@Test
	void testOps() {

		assertEquals(true, Operations.ops("C:\\Users\\malykk\\Documents\\a.txt","null",1));
		assertEquals(true, Operations.ops("C:\\Users\\malykk\\Documents\\b.txt","C:\\Users\\malykk\\Documents\\c.txt", 2));
		assertEquals(false, Operations.ops("C:\\Users\\malykk\\Documents\\b.txt","C:\\Users\\malykk\\Documents\\c.txt", 2));
		assertEquals(true, Operations.ops("C:\\Users\\malykk\\Documents\\a.txt","null",3));

	}
}


