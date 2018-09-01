package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Grep;

import java.io.File;

class GrepTest {

	@Test
	void testGrepApp() {
		File file=new File("C:\\Users\\malykk\\Documents\\a.txt");
		assertEquals(true,Grep.stringSearch(file,"in"));

	}

}