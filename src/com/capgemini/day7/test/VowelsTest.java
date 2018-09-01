package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Vowels;

class VowelsTest {

		@Test
		void test() {
			File file=new File("C:\\\\Users\\\\malykk\\\\Documents\\\\a.txt");
			assertEquals(9,Vowels.countVowels(file));
		}

}
