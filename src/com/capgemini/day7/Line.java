package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Line {

	public static int LineCount() {
		// TODO Auto-generated constructor stub
		
			File file=new File("C:\\Users\\malykk\\Documents\\b.txt");
			int count=0;
			
			try(FileReader readfile=new FileReader(file);
					BufferedReader reader = new BufferedReader(readfile))
			{
			
			while (reader.readLine() != null)
			{
				
				count++;
			}
			System.out.println(count);
			return count;
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return count;
			
	


	}

}

