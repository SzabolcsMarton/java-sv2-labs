package schoolrecords;

public class Subject {

    private final String subjectName;

    public Subject(String subjectName) {
        throwException(subjectName);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    private void throwException(String subjectName){
        if (SchoolHelpers.isEmpty(subjectName)){
            throw new IllegalArgumentException("You must provide the name of the subject!");
        }
    }
}
