package algorithmscount.transaction;

public class Digits {

    public int getCountOfNumbers(){
        int counter = 0;
        for(int i = 10 ; i < 100; i++){
            String number = Integer.toString(i);
            int first = Integer.parseInt(number.substring(0,1));
            int secound = Integer.parseInt(number.substring(1,2));
            if( first + 5 == secound || first -5 == secound){
                counter++;
            }
        }
        return counter;
    }
}
