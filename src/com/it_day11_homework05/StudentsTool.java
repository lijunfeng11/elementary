package com.ithiema_day11_homework05;
/*
 * �������˼��
 * 1 ���������private����
 * 2 ����ķ�������Ҫ��static����
 */

public class StudentsTool {

	private StudentsTool() {

	}

	public static void listStudents(Student[] arr) {
		// ������ӡѧ����Ϣ
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s);
		}

	}

	// public int getMaxScore(Student[] arr):��ȡѧ���ɼ�����߷�
	public static int getMaxScore(Student[] arr) {
		// ������� ������һ���ĳɼ����
		int maxScore = arr[0].getScore();
		// ����
		for (Student s : arr) {
			// �ж� �����ȡ��ֵ�ȶ������������ﻹ��Ͱ����ֵ��ֵ����������ֵ
			if (s.getScore() > maxScore) {
				maxScore = s.getScore();
			}
		}
		return maxScore;
	}

	// public Student getMaxStudent(Student[] arr):��ȡ�ɼ���ߵ�ѧԱ
	public static Student getMaxStudent(Student[] arr) {
		int max = arr[0].getScore();
		for (Student s : arr) {
			if (s.getScore() > max) {
				max = s.getScore();
			}

		}
		//������߷�ѧ��������
		int maxIndex=0;
		for (int i = 0; i < arr.length; i++) {
			//�����߷ֵ�ѧԱ������ƥ��ͽ�����ֵ��ֵ����
			if(arr[i].getScore()==max) {
				max=i;
			}
		}
		return arr[maxIndex];
	}

	// public int getAverageScore(Student[] arr):��ȡѧ���ɼ���ƽ��ֵ
	// public int getCount(Student[] arr):��ȡ�������ѧԱ����

}
