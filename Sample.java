import java.util.Scanner;
public class Sample {
    public static void main(String[]args){
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = sca.nextInt();
        System.out.print("Enter second number : ");
        int second = sca.nextInt();
        System.out.print("Enter operator:  + , - , * , / , % , ** : ");
        sca.nextLine();
        String cr = sca.nextLine().trim(); 

        if(cr.equals("+")){
            System.out.printf("%d + %d = %d\n",first,second,first+second);
        }
        else if(cr.equals("-")){
            System.out.printf("%d - %d = %d\n",first,second,first-second);
        }
        else if(cr.equals("*")){
            System.out.printf("%d * %d = %d\n",first,second,first*second);
        }
        else if(cr.equals("/")){
            if(first == 0){
                System.out.println("Cannot build on zero.");
            }else if(second == 0){
                System.out.println("Cannot divided by zero.");
            }else{
                System.out.printf("%d / %d = %.3f\n",first,second,(float)first/second);    
            }
        }
        else if(cr.equals("%")){
            System.out.printf("%d %% %d = %d",first,second,first%second);
        }
        else if (cr.equals("**")) {
          int result = (int)Math.pow(first, second);
          System.out.printf("%d ** %d = %d", first, second, result);
        }
        else {
          System.out.println("Invalid operator!");
        }
    }
}

