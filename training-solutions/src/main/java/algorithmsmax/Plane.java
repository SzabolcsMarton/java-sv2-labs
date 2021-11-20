package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {
        char[] mapInChars = map.toCharArray();
        int max = 0;
        int ocean = 0;
        for(char c : mapInChars){
            if(c == '0'){
                ocean++;
            }
            if(c == '1' && ocean > max){
                max = ocean;
            }
            if(c == '1'){
                ocean = 0;
            }
        }
        return max;
    }

}