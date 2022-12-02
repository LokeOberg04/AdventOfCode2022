import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2RockPaperScissors {
    public static void main(String[] args) {

        int score = 0;
        String input;

        File text = new File("C:\\Users\\loke.oberg\\IdeaProjects\\AdventOfCode2022\\src\\Day2.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            score += battle(input);
        }
        System.out.println("Slut poäng: " + score);
    }
    public static int battle(String input) {
        int score = 0;
        int a = input.charAt(2);
        a -= 87;
        System.out.println(a);
        score += a;

        if (input.charAt(0) == 'A' && input.charAt(2) == 'X') {
            score += 3;
        } else if (input.charAt(0) == 'A' && input.charAt(2) == 'Y') {
            score += 6;
        } else if (input.charAt(0) == 'A' && input.charAt(2) == 'Z') {
            score += 0;
        } else if (input.charAt(0) == 'B' && input.charAt(2) == 'X') {
            score += 0;
        } else if (input.charAt(0) == 'B' && input.charAt(2) == 'Y') {
            score += 3;
        } else if (input.charAt(0) == 'B' && input.charAt(2) == 'Z') {
            score += 6;
        } else if (input.charAt(0) == 'C' && input.charAt(2) == 'X') {
            score += 6;
        } else if (input.charAt(0) == 'C' && input.charAt(2) == 'Y') {
            score += 0;
        } else {
            score += 3;
        }

        return score;
    }
}