import javax.swing.*;

public class CalorieCounting {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("input");
        int biggest = 0;
        String currnum = "";
        int curint = 0;
        int elfc = 0;
        int elfn = 1;
        int winner = 1;
        int second = 1;
        int third = 1;
        int secondc = 0;
        int thirdc = 0;
        int total = 0;
        System.out.println(input);
        for(int i = 0; i<input.length(); i++) {
            if (input.charAt(i) == ' '){
                curint = Integer.parseInt(currnum);
                elfc += curint;
                currnum = "";
            }
            else  {
                currnum += input.charAt(i);
            }
            if (input.charAt(i) == ' ' && input.charAt(i+1) == ' ') {
                System.out.println("elfc #" + elfn + " = " + elfc);
                elfn += 1;
                if (elfc > biggest) {
                    secondc = biggest;
                    second = winner;
                    biggest = elfc;
                    winner = elfn-1;
                    elfc = 0;
                } else if (elfc > secondc) {
                    thirdc = secondc;
                    third = second;
                    secondc = elfc;
                    second = elfn-1;
                    elfc = 0;
                } else if (elfc > thirdc) {
                    thirdc = elfc;
                    third = elfn-1;
                    elfc = 0;
                } else {
                    elfc = 0;
                }
                i++;
            }
        }
        curint = Integer.parseInt(currnum);
        elfc += curint;
        System.out.println("elfc #" + elfn + " = " + elfc);
        if (elfc > biggest) {
            biggest = elfc;
            winner = elfn;
        }
        System.out.println("Biggest calorie number was: " + biggest + "\nBy elf #" + winner);
        System.out.println("Second biggest calorie number was: " + secondc + "\nBy elf #" + second);
        System.out.println("Third biggest calorie number was: " + thirdc + "\nBy elf #" + third);
        total = biggest + secondc + thirdc;
        System.out.println("Their total calorie number was: " + total);
    }
}
