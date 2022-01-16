package collectionsclass;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult>{

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return resultPoints == that.resultPoints && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, resultPoints);
    }


    @Override
    public int compareTo(ExamResult o) {
        return Integer.valueOf(this.resultPoints).compareTo(o.getResultPoints());
    }
}
