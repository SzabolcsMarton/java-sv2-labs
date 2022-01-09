package catalog;

import java.util.List;

public class PrintedFeatures extends BaseFeature {

    private final int numberOfPages;
    private final List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        super(title);
        validateParameters(title, numberOfPages, authors);
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }


    private void validateParameters(String title, int numberOfPages, List<String> authors) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Length must be over zero!");
        }
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("Authors list is empty");
        }

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

}

