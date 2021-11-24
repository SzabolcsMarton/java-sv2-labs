package methodpass;

public class One {

    public int addOne(int number){
        return number + 1;
}

    public static void main(String[] args) {
        One one = new One();
        int number = 0;
        System.out.println(number);
        number++;
        System.out.println(number);
        one.addOne(number);
        System.out.println(number);


    }
}
