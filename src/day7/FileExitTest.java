package day7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testFile() {
		File  file=new File("C:\\Users\\malykk\\Desktop\\malyka\\varuni");
		assertEquals(true, file.exists());

	
	}

}
