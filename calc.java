import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Objects;

public class calc 
{

    public static void main(String[] args) 
    {
        double num1;
        double num2;
        String operation;
        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });


        Scanner input = new Scanner(System.in);
     
        System.out.println("please enter the first number");
        num1 = input.nextInt();
        
    
      

        System.out.println("please enter the second number");
        num2 = input.nextInt();

            Scanner op = new Scanner(System.in);
        System.out.println("Please enter operation");
        operation = op.next();


        

        System.out.println("svar  " + operation);

        if (Objects.equals(operation,"+"))
        {
            System.out.println("your answer is " + (num1 + num2));
        }

        else if (Objects.equals(operation,"-"))
        {
            System.out.println("your answer is " + (num1 - num2));
        }

        if (Objects.equals(operation,"/"))
        {
            System.out.println("your answer is " + (num1 / num2));
        }
        if (Objects.equals(operation,"*"))
        {
            System.out.println("your answer is " + (num1 * num2));
        }

  input.close();
    }
}