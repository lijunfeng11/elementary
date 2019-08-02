package com.ithiema_day14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test03 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();

		list.add("1212");
		list.add("456456");
		list.add("78979");
		
		BufferedWriter dw=new BufferedWriter(new FileWriter("d.txt"));

		for (String s : list) {
			dw.write(s);
			dw.newLine();
			dw.flush();
		}
	}
}
