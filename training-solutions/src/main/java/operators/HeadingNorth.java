package operators;

public class HeadingNorth {
    public  int getNumberOfDirections(){
        int deg = 0;
        int roundCounter = 0;
        for(int i = 10; deg < 360; i += 10){
            roundCounter++;
            deg += i;
        }
        return roundCounter;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth= new HeadingNorth();
        System.out.println(headingNorth.getNumberOfDirections());

    }
}
