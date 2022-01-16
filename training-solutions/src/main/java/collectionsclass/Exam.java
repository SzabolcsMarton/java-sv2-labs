package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {

    private List<ExamResult> results;

    public Exam(List<ExamResult> results) {
        this.results = results;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> ordered = new ArrayList<>(results);
        List<String> resultNameList = new ArrayList<>();
        if (places > ordered.size()) {
            places = ordered.size();
        }
        Collections.sort(ordered);
        Collections.reverse(ordered);
        for (int i = 0; i < places; i++) {
            resultNameList.add(ordered.get(i).getName());
        }

        return resultNameList;
    }

    public List<ExamResult> getResults() {
        return new ArrayList<>(results);
    }
}
