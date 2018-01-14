package com.iunetworks.internship.maven.test;

import java.util.*;
import java.io.*;

public class Main {

	private static BufferedReader reader;
	private static ArrayList<byte[]> arrayList;
	private static int input;

    public static void main(String[] args) throws Exception {

    	arrayList = new ArrayList<>();
    	reader = new BufferedReader(new InputStreamReader(System.in));

    	while(true) {

    		switch(Integer.parseInt(reader.readLine())) {
    			case 1:
	    			arrayList.add(new byte[1024 * 1024]);
	    			System.out.println("1mb memory was reserved");
    				break;

    			case 2:
    				if(arrayList.size() == 0) 
    					System.out.println("Nothing to remove");
    				else {
    					arrayList.remove(0);
    					System.out.println("1mb memory was freed");
    				}
    				break;

    			case 3: 
    				System.gc();
    				System.out.println("GC was called");
    				break;

    			default: System.out.println("Bad input");
    		}

    	}

	}
}
