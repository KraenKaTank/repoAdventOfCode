package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calories {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String calories = """
				1000
				2000
				3000

				4000

				5000
				6000

				7000
				8000
				9000

				10000
				""";
		
		BufferedReader br = new BufferedReader(new FileReader("calNumber.txt"));
		
		int calorie = 0;
		int mostCalories = 0;
		
		List<Integer> calorieList = new ArrayList<>();
		
		String strCal;
		String line;
		//for(String s : calories.split("\n")) {
		while((line = br.readLine()) != null) {
			strCal = line.trim();
			
			 if(strCal.isBlank()) {
				 if(mostCalories < calorie) {
					 mostCalories = calorie;
				 }
				 calorieList.add(calorie);
				 calorie = 0;
				 continue;
			 }
			 calorie += Integer.parseInt(strCal);
			 
		}
		calorieList.add(calorie);
		if(mostCalories < calorie) {
			 mostCalories = calorie;
		 }
		br.close();
		
		calorieList.sort((a, b)-> b - a);
		System.out.println(calorieList.get(0) + calorieList.get(1) + calorieList.get(2));
		

		}
		

}

