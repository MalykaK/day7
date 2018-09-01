package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void test() {
		File  file=new File("C:\\Users\\malykk\\Desktop\\malyka\\varuni");
		assertEquals(true, file.exists());

	}

}



