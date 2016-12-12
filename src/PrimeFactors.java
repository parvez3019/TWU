import java.util.ArrayList;

/**
 * Created by parvez on 13/12/16.
 */
public class PrimeFactors {

    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 2;
        while( n > 1){
            if( n % i == 0){
                list.add(i);
                n = n/i;
            }
            else
                i++;
        }
        return list;
    }

    public static void main(String[] args){
        ArrayList<Integer> listofFactors = new ArrayList<>();
        listofFactors = generate(100);

        if(listofFactors.isEmpty())
            System.out.print("No factors");
        else{
            for (int i = 0; i < listofFactors.size() ; i++) {
                System.out.println(listofFactors.get(i));
            }
        }

    }
}
