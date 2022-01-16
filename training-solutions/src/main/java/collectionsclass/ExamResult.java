package collectionsclass;

public class ExamResult {

    private final String name;
    private final int resultPoints;

    public ExamResult(String name, int resultPoints) {
        this.name = name;
        this.resultPoints = resultPoints;
    }

    public String getName() {
        return name;
    }

    public int getResultPoints() {
        return resultPoints;
    }
}
