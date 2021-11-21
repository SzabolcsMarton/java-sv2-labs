package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        List<Integer> result = new ArrayList<>();
        for (FamilyMember actual : familyMembers) {
            if (actual.getName().contains(name)) {
                result.add(actual.getAge());
            }
        }
        return result;
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(FamilyMember newMember) {
        familyMembers.add(newMember);
    }
}
