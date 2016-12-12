/**
 * Created by parvez on 13/12/16.
 */
public class Patterns {

    public static void printStar(){
        System.out.print("*");
    }

    public static void printHorizontalLine(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void printVerticalLine(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*\n");
        }
    }


    public static void printRightTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle (int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < Math.abs( n - i -1) ; j++ )
                System.out.print(" ");
            for(int j = 0 ; j < 2*( n - Math.abs(n-i-1))-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int n)
    {
        for(int i = 0 ; i < 2*n-1 ; i++)
        {
            for(int j = 0 ; j < Math.abs( n - i -1) ; j++ )
                System.out.print(" ");
            for(int j = 0 ; j < 2*( n - Math.abs(n-i-1))-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamondWithName(int n)
    {
        for(int i = 0 ; i < 2*n-1 ; i++)
        {
            if(i == n-1)
                System.out.println("Bill");
            else
            {
                for(int j = 0 ; j < Math.abs( n - i -1) ; j++ )
                    System.out.print(" ");
                for(int j = 0 ; j < 2*( n - Math.abs(n-i-1))-1 ; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }


    public static void main(String[] args){
//      1.
        System.out.println("Print single star:");
        printStar();

//      2.
        System.out.println();
        System.out.println("Print Horizontal star line:");
        printHorizontalLine(5);

//      3.
        System.out.println();
        System.out.println("Print Vertical star line:");
        printVerticalLine(5);

//      4.
        System.out.println();
        System.out.println("Print right triangle:");
        printRightTriangle(3);


//      5.
        System.out.println();
        System.out.println("Print isosceles triangle:");
        printIsoscelesTriangle(3);


//      6.
        System.out.println();
        System.out.println("Print Diamond:");
        printDiamond(3);


//      7.
        System.out.println();
        System.out.println("Print Diamond with name:");
        printDiamondWithName(3);


    }

}
