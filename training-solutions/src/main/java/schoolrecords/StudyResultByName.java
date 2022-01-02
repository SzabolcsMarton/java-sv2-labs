package schoolrecords;

public class StudyResultByName {

    private final String studentName;
    private final double studyAverage;

    public StudyResultByName(String name, double studyAverage) {
        this.studentName = name;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    @Override
    public String toString(){
        return studentName + ": " + studyAverage;
    }
}
