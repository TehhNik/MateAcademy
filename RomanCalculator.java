
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections.*;

public class RomanCalculator {
    int a=0, b=0, res=0, cont=0;
    final String opers="+-*/%";
    String oper;
    Scanner skn;

    RomanCalculator (){

        System.out.println("Roman Numeral Calculator\n1) Enter the first number\r\n" +
                "2) Enter the second number\r\n" +
                "3) Enter a math sign: +, -, *, \\, %\r\n");
    }

    public void calculate() {

        do {
            System.out.print("Enter the first number  - ");
            skn=new Scanner(System.in);
            a=getArabNumber(skn.next());
            System.out.print("Enter the second number - ");
            skn=new Scanner(System.in);
            b=getArabNumber(skn.next());
            System.out.print("Enter operation - ");
            skn=new Scanner(System.in);
            oper=skn.next();
            if (opers.contains(oper)){
                switch (oper) {
                    case "-": res=a-b; break;
                    case "+": res=a+b; break;
                    case "*": res=a*b; break;
                    case "/": res=a/b; break;
                    case "%": res=a%b;
                }
            }
            System.out.println("\n== The result: "+getRomanNumber(res)+" ("+res+") ==");
            System.out.println("\nDo you want to continue?\n1 - yes\n2 - no");
            skn=new Scanner(System.in);
            cont=skn.nextInt();

        } while (cont==1);

    }

    public String getRomanNumber(int number) {
                return String.join("", Collections.nCopies(number, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }

            private int getNumFromSingleRom(char letter) {
            switch (letter) {
                case 'M':
                    return 1000;
                case 'D':
                    return 500;
                case 'C':
                    return 100;
                case 'L':
                    return 50;
                case 'X':
                    return 10;
                case 'V':
                    return 5;
                case 'I':
                    return 1;
                default:
                    return 0;
            }
        }

    public int getArabNumber(String roman) {
            int result = 0;
            String uRoman = roman.toUpperCase();
            for (int i = 0; i < uRoman.length() - 1; i++) {
                if (getNumFromSingleRom(uRoman.charAt(i)) < getNumFromSingleRom(uRoman.charAt(i + 1))) {
                    result -= getNumFromSingleRom(uRoman.charAt(i));
                } else {
                    result += getNumFromSingleRom(uRoman.charAt(i));
                }
            }
            result += getNumFromSingleRom(uRoman.charAt(uRoman.length() - 1));
            return result;
        }


}