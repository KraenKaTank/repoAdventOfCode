package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RockPaperScissors {
	
	/**
	 * Enemy
	 * A = Rock
	 * B = Paper
	 * C = Scissors
	 * 
	 * Me
	 * X = Rock
	 * Y = Paper
	 * Z = Scissors
	 * 
	 * score
	 * 
	 * 1 = Rock
	 * 2 = Paper
	 * 3 = Scissors
	 * 
	 * 0 = lost
	 * 3 = Draw
	 * 6 = Win
	 * 
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		
//		String test = """
//			A Y
//			B X
//			C Z
//		""";
//		
		
		
		BufferedReader br = new BufferedReader(new FileReader("E:\\Programming\\GitHub-Repos\\repoAdventOfCode\\AdventOfCode\\src\\Day2\\Rock.txt"));
		String strMatch;
		int result = 0;
		String line;
		
		while((line = br.readLine()) != null) {

			strMatch = line.trim();
		
			switch (strMatch){
			
				case ("A Y"): result += 4;
				break;
				
				case("A X"): result += 3;
				break;
				
				case("A Z"): result += 8;
				break;
				
				case("B Y"): result += 5;
				break;
				
				case("B X"): result += 1;
				break;
				
				case("B Z"): result += 9;
				break;
				
				case("C Y"): result += 6;
				break;
				
				case("C X"): result += 2;
				break;
				
				case("C Z"): result += 7;	
			}
		
			
		} 
		System.out.println(result);
		br.close();
		
	
		
	}

}
