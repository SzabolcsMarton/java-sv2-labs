package searching;

import java.util.Arrays;

public class Mountain {

    private int[] heightOfPike;

    public Mountain(int[] heightOfPike) {
        this.heightOfPike = heightOfPike;
    }

    public boolean searchPike(Pike pike){
        int i = Arrays.binarySearch(heightOfPike, pike.getHeight());
        return 0 <= i;
    }

    public int[] getHeightOfPike() {
        return heightOfPike;
    }
}
