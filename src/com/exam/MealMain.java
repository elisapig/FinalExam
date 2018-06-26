package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MealMain {

	

	

	public static void main(String[] args) {
		Main mm = new Main();
		
		try {
			FileReader fr = new FileReader("menu.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] tokens = line.split(",");
			int id = Integer.parseInt(tokens[0]);
			for(int i=0;i<=id;i++){
				String name = tokens[i * 2 - 1];
				int price =  Integer.parseInt(tokens[i*2]);
				int kcal = Integer.parseInt(tokens[i*2+1]);
				 mm.meals.add(new Meal(i,name,price,kcal));
			}
			mm.on();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
