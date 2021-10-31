package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private String name;
    private List<Double> kms;
    private String text = "Kedves %s! A mai dátum: %s . Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!";

    public Run(String name) {
        this.name = name;
        this.kms = new ArrayList<>();
    }

    public void addRun(double kms){
        this.kms.add(kms);
    }

    public String printFormattedRunText(){
        String date = LocalDate.now().toString();
        int day = kms.size();
        double todayKms = kms.get(kms.size() - 1);
        return String.format(text,name,date,day,todayKms);
    }

    public static void main(String[] args) {
        Run run = new Run("John Connor");
        run.addRun(15.5);
        System.out.println(run.printFormattedRunText());
        run.addRun(14.2);
        System.out.println(run.printFormattedRunText());
        run.addRun(13.0);
        System.out.println(run.printFormattedRunText());
        run.addRun(10.0);
        System.out.println(run.printFormattedRunText());
    }
}
