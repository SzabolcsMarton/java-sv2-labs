package mathproblems;

public class Division {
    public  void  getDivision( int number){
        for(int i = 1; i < number+1; i++){
            if((number % i) == 0){
                System.out.println(number + " osztoja: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivision(12);
    }
}
