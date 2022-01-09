package catalog;

public class SearchCriteria {

    private final String title;
    private final String contributor;

    public SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByTitle(String title) {
        if(title == null){
            throw new IllegalArgumentException("Title is null");
        }
        return new SearchCriteria(title,null);

    }

    public static SearchCriteria createByContributor(String contributor) {
        if(contributor == null)
            throw new IllegalArgumentException("Contributor is null");

        return new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if(contributor == null || title == null){
            throw new IllegalArgumentException("Title or Contributor is null");
        }
        return new SearchCriteria(title,contributor);
    }

    public String getTitle() {
        return title;
    }

    public boolean hasTitle() {
        return !Validators.isBlank(title);
    }

    public boolean hasContributor() {
        return !Validators.isBlank(contributor);
    }

    public String getContributor() {
        return contributor;
    }
}
