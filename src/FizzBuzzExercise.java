/**
 * Created by parvez on 13/12/16.
 */
public class FizzBuzzExercise {

    public static void FizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            if( i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if( i % 5 == 0)
                System.out.println("Buzz");
            else if( i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }

    public static void main(String[] args){
        FizzBuzz();
    }
}
