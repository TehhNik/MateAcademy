
import java.util.Scanner;

public class BasicCalculator {

    double a=0, b=0, res=0, cont=0;
    String opers="+-*/%";
    String oper;
    Scanner skn;


    BasicCalculator (){

        System.out.println("Basic Calculator\n1) Enter the first number\r\n" +
                "2) Enter the second number\r\n" +
                "3) Enter a math sign: +, -, *, \\, %\r\n");

    }

    public void calculate() {

        do {
            System.out.print("Enter the first number  - ");
            skn=new Scanner(System.in);
            a=skn.nextInt();
            System.out.print("Enter the second number - ");
            skn=new Scanner(System.in);
            b=skn.nextInt();
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
            System.out.println("\n== The result: "+res+" ==");
            System.out.println("\nDo you want to continue?\n1 - yes\n2 - no");
            skn=new Scanner(System.in);
            cont=skn.nextInt();

        } while (cont==1);

    }




}

