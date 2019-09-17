import java.util.Scanner;

class assign3_2 {


   public static double fact(double n)
   { int j;
    double sum = 1;
    for(j=1;j<=n;jj++)
        sum = sum*j;
    return sum;
   }

    public static void main(String[] args){
        int indic,i,n = 20;
        double sum;
        do {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        double x = userInput.nextDouble();
        sum = 1;
        for (i=1; i<n;i++)
            {sum+=(Math.pow(value,i))/fact(i);
            System.out.println();
            System.out.printf("e^%s", value);
            System.out.printf("(i=%2s)", i);
            System.out.printf("%15.10f",sum);
            System.out.println();
            }

            System.out.println("Enter 1 to repeat or 0 to end");
            indic = userInput = nextInt();
        }
            while (indic == 1);


                }
    }