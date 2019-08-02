package com.itheima_总结;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Demo8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("aa.txt"));

		String line = br.readLine();// "22 11 55 44 33"

		br.close();

		String[] strs = line.split(" ");
		int[] arr = new int[strs.length];// 11 22 33 44 55

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}

		Arrays.sort(arr);// 给数组进行升序排序

		StringBuilder sb = new StringBuilder();// 11 22 33 44 55

		for (int i : arr) {
			sb.append(i + " ");
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));

		bw.write(sb.toString());

		bw.close();

	}

}
