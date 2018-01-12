package com.iunetworks.internship.maven.test;

import java.util.*;
import java.io.*;

public class Main {

	private static BufferedReader reader;
	private static ArrayList arrayList;

    public static void main(String[] args) throws Exception {

    	arrayList = new ArrayList();
    	reader = new BufferedReader(new InputStreamReader(System.in));

    	while(true) {

    		arrayList.add(new byte[Integer.parseInt(reader.readLine()) * 1024]);

    	}

	}
}
