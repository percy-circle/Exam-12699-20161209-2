package com.hand.lkl.Exam_12699_20161209_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("请输入工资：");
		Scanner scanner = new Scanner(System.in);
		double tax = 0;
		double income = scanner.nextDouble();
		double ouverIncome = income - 3500;
		if (ouverIncome < 0) {
			tax=0;
		} else if (ouverIncome <= 1500) {
			tax = ouverIncome * 0.03;
		} else if (ouverIncome <= 4500) {
			tax = ouverIncome * 0.1;
		} else if (ouverIncome <= 9000) {
			tax = ouverIncome * 0.2;
		} else if (ouverIncome <= 35000) {
			tax = ouverIncome * 0.25;
		} else if (ouverIncome <= 35000) {
			tax = ouverIncome * 0.25;
		}else if (ouverIncome <= 55000) {
			tax = ouverIncome * 0.3;
		}else if (ouverIncome <=80000) {
			tax = ouverIncome * 0.35;
		}else {
			tax = ouverIncome * 0.45;
		}
		System.out.println("所需要缴纳的税费为:"+tax);
	}
}
