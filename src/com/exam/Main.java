package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	List<Meal> meals = new ArrayList<>();
	
	public void on(){
		int a=-1;
		while(a!=0){
		for (int i=0;i<meals.size();i++){
			System.out.println("每項餐點如下:");
			Meal meal = meals.get(i);
			
			System.out.println(meal.getId()+")"+meal.getName());
		}
		System.out.println(0+")"+"結算");
		System.out.println("q"+")"+"離開");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入餐點:");
		int line = scanner.nextInt();
		
		System.out.println("請輸入數量:");
		String line1 = scanner.nextLine();
		
		
		
		System.out.println("目前餐點:");
		System.out.println(i+1+"."+"\t" + line +"\t"+ line1+"份");
		switch(line){
		case "1":
			System.out.println("合計"+ );
			
		}
		}}
	}

