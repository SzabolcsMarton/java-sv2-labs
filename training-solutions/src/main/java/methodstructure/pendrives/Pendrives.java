package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public  Pendrive getBest(List<Pendrive> pendrives){
        Pendrive min = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++){
            if(min.comparePricePerCapacity(pendrives.get(i)) == 1 ){
                min = pendrives.get(i);
            }
        }
        return min;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives){
        Pendrive min = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++){
            if(!min.isCheaperThan(pendrives.get(i))){
                min = pendrives.get(i);
            }
        }
        return min;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity){
        for(Pendrive actual : pendrives){
            if(actual.getCapacity() == capacity){
                actual.risePrise(percent);
            }
        }
    }
}
