package com.iunetworks.internship.maven.test;

import java.util.*;
import java.io.*;

public class Main {

	private static BufferedReader reader;
	private static ArrayList<byte[]> arrayList;

    public static void main(String[] args) throws Exception {

    	arrayList = new ArrayList<>();
    	reader = new BufferedReader(new InputStreamReader(System.in));

    	while(true) {

    		if(Integer.parseInt(reader.readLine()) == 1) {
    			arrayList.add(new byte[1024]);
    			System.out.println("1mb memory was reserved");
    		} else if(arrayList.size() == 0) System.out.println("Nothing to remove");
    		else {
    			arrayList.remove(0);
    			System.out.println("1mb memory was freed");
    		}
    	}

	}
}
