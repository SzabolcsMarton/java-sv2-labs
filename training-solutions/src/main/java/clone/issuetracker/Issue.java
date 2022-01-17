package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private String name;
    private LocalDateTime time;
    private Status status;

    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue issue, CopyMode copyMode) {
        name = issue.name;
        time = issue.time;
        status = issue.status;
        if(copyMode.equals(CopyMode.WITH_COMMENTS)){
            List<Comment> temp = new ArrayList<>();
            for (Comment actual : issue.comments){
                temp.add(new Comment(actual));
            }
            comments = temp;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Comment> getComments(){
        return new ArrayList<>(comments);
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }
}
