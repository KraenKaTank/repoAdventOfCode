package Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class RockPaperTutorial {

	final static int rock = 1;
	final static int paper = 2;
	final static int scissors = 3;
	
	final static int loss = 0;
	final static int draw = 3;
	final static int win = 6;
	

	public static void main(String[] args) throws FileNotFoundException {
		
		Map<String, Integer>shapes = new HashMap<>();
		shapes.put("A", rock);
		shapes.put("B", paper);
		shapes.put("C", scissors);
		shapes.put("X", rock);
		shapes.put("Y", paper);
		shapes.put("Z", scissors);
		
		String testdata = """
				A Y
				B X
				C Z
				""";
		
		BufferedReader br = new BufferedReader(new FileReader("Rock.txt"));
		
		int score = 0;
		
		//String line;
		//while((line = br.readLine()) != null){
		for(String line : testdata.split("\n"));{
			String[] match = line.trim().split(" ");
			
			if(shapes.get(match[0]) == shapes.get(match[1])) {
				score += draw;
			}else if(shapes.get(match[0]) == 1 && shapes.get(match[1]) == 2) {
				score += win;
			}else if(shapes.get(match[0]) == 2 && shapes.get(match[1]) == 3) {
				score += win;
			}else if(shapes.get(match[0]) == 3 && shapes.get(match[1]) == 1) {
				score += win;
			}else {
				score += loss;
			}
		
		
		
		
	}

}
