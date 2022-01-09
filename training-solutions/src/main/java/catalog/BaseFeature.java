package catalog;

import java.util.List;

public abstract class BaseFeature implements Feature{
    private final String title;

    protected BaseFeature(String title) {
        this.title = title;
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
