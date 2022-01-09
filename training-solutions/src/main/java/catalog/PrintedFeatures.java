package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

    private final String title;
    private final int numberOfPages;
    private final List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        validateParameters(title, numberOfPages, authors);
        this.title = title;
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

//    public int getNumberOfPagesWithMin(int minPage){
//        if(minPage >= numberOfPages){
//            return 0;
//        }
//        return numberOfPages;
//    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean hasContributors(String conrtributor) {
        List<String> contributors = this.getContributors();
        for(String actual : contributors){
            if(actual.equals(conrtributor)){
                return true;
            }
        }
        return false;
    }
}

