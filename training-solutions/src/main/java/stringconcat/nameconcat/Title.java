package stringconcat.nameconcat;

public enum Title {

    MR("Mr."), MRS("Mrs."), Ms("Ms."), Dr("Dr.");

    private String stringOfTitle;

    Title(String stringOfTitle) {
        this.stringOfTitle = stringOfTitle;
    }

    public String getStringOfTitle() {
        return stringOfTitle;
    }

}
