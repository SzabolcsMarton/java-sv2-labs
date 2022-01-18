package lambdaoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {

    private List<Member> members;

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate){
        for(Member actual : members){
            if(predicate.test(actual)){
                return Optional.of(actual);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        if(members.isEmpty()){
            return Optional.empty();
        }
        int sumOfSkills = 0;
        for(Member actual : members){
            sumOfSkills += actual.getSkills().size();
        }

        return Optional.of((double)sumOfSkills / members.size());
    }

    public List<Member> getMembers() {
        return new ArrayList<>(members);
    }

    public void setMembers(Member member) {
        this.members.add(member);
    }
}
