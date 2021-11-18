package algorithmssum.school;

import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headCounts){
        int sum = 0;
        for (int actual : headCounts){
            sum += actual;
        }
        return sum;
    }
}
