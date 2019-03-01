
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int choiceCalc=0 ;

        do {

            System.out.println("Make a choice, enter:\n\"1\" for Basic Calculator\n\"2\" for Roman Numeral Calculator");
            Scanner myVar=new Scanner(System.in);
            try{
                choiceCalc =myVar.nextInt();
            }
            catch (Exception e) {System.out.println("== Please ==");}

            switch (choiceCalc) {
                case 1 : {BasicCalculator calc=new BasicCalculator(); calc.calculate();  break;}
                case 2 : {RomanCalculator calc=new RomanCalculator(); calc.calculate();  break;}
                default : System.out.println("== Enter 1 or 2 ==\n");
            }

        } while (choiceCalc!=1 && choiceCalc!=2);

        String oper= "+-/*%";
        System.out.println(oper.charAt(2));
    }
}
