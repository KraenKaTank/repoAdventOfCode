package Day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Rucksack {

	public static void main(String[] args) throws IOException {
//		String rucksack = """
//				vJrwpWtwJgWrhcsFMMfFFhFp
//				jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
//				PmmdzqPrVvPwwTWBwg
//				wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
//				ttgJtRGJQctTZtZT
//				CrZsJsPPZsGzwwsLwLmpwMDw
//				""";
		
		BufferedReader br = new BufferedReader(new FileReader("E:\\Programming\\GitHub-Repos\\repoAdventOfCode\\AdventOfCode\\src\\Day3\\rucksackInput"));
		
		int score = 0;
		
		String alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String line;
		while((line = br.readLine()) != null) {
		
		//	for(String line : rucksack.split("\n")) {
			int[] chars = new int[line.length()];
			int i = 0;
			for(String e : line.split("")) {
				chars[i] = alphabet.indexOf(e);
				i++;
			}
			int[] first = Arrays.copyOfRange(chars, 0, chars.length / 2);
			int[] second = Arrays.copyOfRange(chars, chars.length / 2, chars.length);
			
			Set<Integer> scores = new HashSet<>();
			
			for(int k = 0; k < first.length; k++) {
				for(int j = 0; j < second.length; j++) {
					if(first[k] == second[j]) {
						scores.add(first[k]);
					}
				}
				
			}
			score += scores.stream().reduce((a, b) -> a + b).get();
			
			
		}
		System.out.println(score);
		br.close();
			
	}

}
