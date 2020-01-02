package myJavaProject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//import java.util.Scanner;

public class MyMainClass {

	public static void main(String[] args) {

		MyMainClass firstInst = new MyMainClass();
		firstInst.testMethod1();
		
		java.util.Scanner myScanner = new java.util.Scanner(System.in);
		User user = new User();
		
		System.out.println("entwr user first Name:");
		String name = myScanner.nextLine();
		user.setFirstName(name);
		System.out.println(name + ", enter user last name:");
		name = myScanner.nextLine();
		user.setLastName(name);
		System.out.println("user full name:" + user.getFullName());
		
		Student student = new Student ();
		name = myScanner.nextLine();
		student.setFirstName(name);
		System.out.println(name + ", enter student last name:");
		name = myScanner.nextLine();
		student.setLastName(name);
		System.out.println("student full name:" + student.getFullName());
		student.setFieldOfStudy("Informatic");
		System.out.println("student field of study:" + student.getFieldOfStudy());
	}

	public void testMethod1 () {
		
		// Datentypen, die nicht als Primitives sondern als Klassen verwaltet werden
		Integer myInt =15;
		float myFloat = myInt.floatValue();
		System.out.println(Integer.BYTES);
		System.out.println(myFloat);
		System.out.println((float)myInt);

		// Array kopieren, vergleichen, ...
		int[] myArray1 = new int [10];
		int[] myArray2 = {9,8,7,6,5,4,3,2,1,0};
		
		myArray1 = myArray2.clone();
		myArray2[2] = 0;
		System.out.println( Arrays.toString(myArray1));
		System.out.println( Arrays.toString(myArray2));
		System.out.println(Arrays.equals(myArray1, myArray2));
		
		// Array List
		List<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.add(0, 25);
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.toString());

		// Liste füllen:
		List<Integer> myList2 = Arrays.asList(1,4,6,2,9);
		System.out.println(myList2.toString());
	
		// durch Liste iterieren
		for (int listElement : myList2) {
			System.out.println(listElement);
		}	 
			
		// Liste sortieren
		Collections.sort(myList2);
		System.out.println("sorted list:/n"+myList2.toString());	
			
		Collections.shuffle(myList2);
		System.out.println("shuffle list:/n"+myList2.toString());	
	}
}
