package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.BinaryInteger;

import java.io.File;


class BinaryIntegerTest {

	
		@Test
		void testBinaryInteger() {
			File file = new File("C:\\Users\\malykk\\Desktop\\malyka\\varuni");
			assertEquals(1,BinaryInteger.writeBinary(file));
		}

	}

