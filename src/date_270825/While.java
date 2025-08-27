package date_270825;

public class While {
    public static void main(String[] args) {


        // print odd numbers 1-100
        // output = 1,3,5,7,...99;

        // while(condition) while(i<=100)
        //for(inti , condition, iteration) for(int i =1; i<=100; i++)
        int i = 1;
        while (i <= 100) {

            if (i % 2 == 1) {
                if (i == 1)
                    System.out.print("Output= ");

                System.out.print(i );
                if (i!=99)
                    System.out.print(", ");

            }
            i++;
        }
        System.out.print("\nLoop has endeD!");

    }
}
