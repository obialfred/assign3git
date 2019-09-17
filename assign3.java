import java.util.Scanner;

class assign3 {


    static double getPop (double init, int days){
        double x = init; 
        double b = init;
        int n  = days/5;


        for(int i=1;i<=n;i++)
        {
            double temp = x;
            x = y;
            y = temp + y;
        }
        return x;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter initial population size: ");
        System.out.println("or a blank line to quit: ");
        String size = userInput.nextLine();
        while ((size != null ) && (size.length()>0))
        {
            double initSize = Double.parseDouble(size);

            System.out.println("Enter the number of (whole) days: ");
            int days = userInput.nextInt();
            System.out.println("Population after " +days+ "days = " + getPop(initSize,days));

            System.out.println();
            System.out.println("Enter initial population size: ");
            System.out.println("or a blank line to quit:");
            userInput.nextLine();
            size = userInput.nextLine();

                }
    }
}