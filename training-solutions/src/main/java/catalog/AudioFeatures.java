package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private List<String> composer;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        validate(title, length);
        validateList(performers);
        this.title = title;
        this.length = length;
        this.performers = performers;

    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        validate(title, length);
        validateList(performers, composer);
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    private void validate(String title, int length) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("String parameter is not valid!");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be over zero!");
        }
    }

    private void validateList(List<String> listToValidate){
        if(Validators.isEmpty(listToValidate)){
            throw new IllegalArgumentException("List is empty");
        }
    }

    private void validateList(List<String> listToValidate, List<String> otherListToValidate){
        if(Validators.isEmpty(listToValidate)){
            throw new IllegalArgumentException("First list is empty");
        }
        if(Validators.isEmpty(otherListToValidate)){
            throw new IllegalArgumentException("Second list is empty");
        }
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        if (!Validators.isEmpty(composer)) {
            contributors.addAll(composer);
        }
        if(!Validators.isEmpty(performers)){
            contributors.addAll(performers);
        }
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
