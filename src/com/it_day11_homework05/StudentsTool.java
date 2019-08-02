package com.ithiema_day11_homework05;
/*
 * 工具类的思想
 * 1 定义的类用private修饰
 * 2 定义的方法都需要用static修饰
 */

public class StudentsTool {

	private StudentsTool() {

	}

	public static void listStudents(Student[] arr) {
		// 遍历打印学生信息
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s);
		}

	}

	// public int getMaxScore(Student[] arr):获取学生成绩的最高分
	public static int getMaxScore(Student[] arr) {
		// 定义参照 物假设第一个的成绩最高
		int maxScore = arr[0].getScore();
		// 遍历
		for (Student s : arr) {
			// 判断 如果获取的值比定义的这个参照物还大就把这个值赋值给定义的最大值
			if (s.getScore() > maxScore) {
				maxScore = s.getScore();
			}
		}
		return maxScore;
	}

	// public Student getMaxStudent(Student[] arr):获取成绩最高的学员
	public static Student getMaxStudent(Student[] arr) {
		int max = arr[0].getScore();
		for (Student s : arr) {
			if (s.getScore() > max) {
				max = s.getScore();
			}

		}
		//定义最高分学生的索引
		int maxIndex=0;
		for (int i = 0; i < arr.length; i++) {
			//如果最高分的学员和索引匹配就将索引值赋值给他
			if(arr[i].getScore()==max) {
				max=i;
			}
		}
		return arr[maxIndex];
	}

	// public int getAverageScore(Student[] arr):获取学生成绩的平均值
	// public int getCount(Student[] arr):获取不及格的学员数量

}
