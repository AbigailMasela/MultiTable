import java.util.Scanner;

public class MultiTable{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a, b, max, result, c;

        System.out.println("Enter the maximum number for your table");
        max = scan.nextInt();

        System.out.println("Multiplication table: \n");

     /*   for(c = 1; c <= max; c++){
            System.out.println(String.format("%4d",c));
            System.out.println("_ ");
        }*/
      //  System.out.print(String.format("%4d", " ");

        for(a = 1; a <= max; a++){
            System.out.print(String.format("%4d", a));
        }
        System.out.println();

        for(a = 1; a <= max; a++){
            System.out.print("\t----");
        }
        System.out.println();
        
        for(a = 1; a <= max; a++){
            System.out.print(String.format("%4d",a));
            System.out.print("| ");
            for(b = 1; b <= max; b++){
                result = a * b;

                 //System.out.print(b + " ");
                // System.out.print("=");
                System.out.print(String.format("%4d",result));
            }
            System.out.println();
        }

    }
}