package com.itheima.d730;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(""));
		String line = br.readLine();
		br.close();

		String[] split = line.split(" ");
		int[] arr = new int[split.length];

		for (int i = 0; i < arr.length; i++) {

			 arr[i]=Integer.parseInt(split[i]);
			
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i + " ");
		}
	}
}
