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
			String name = tokens[1];
				int price =  Integer.parseInt(tokens[2]);
				int kcal = Integer.parseInt(tokens[3]);
				 mm.meals.add(new Meal(id,name,price,kcal));
				 line =br.readLine();
			mm.on();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
