package schoolrecords;

public enum MarkType {
    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private final int intMarkType;
    private final String stringMarkType;

    MarkType(int intMarkType, String stringMarkType) {
        this.intMarkType = intMarkType;
        this.stringMarkType = stringMarkType;
    }

    public int getIntMarkType() {
        return intMarkType;
    }

    public String getStringMarkType() {
        return stringMarkType;
    }
}
