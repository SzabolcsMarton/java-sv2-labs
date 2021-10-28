package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {
    private List<Hardwere> hardwereList = new ArrayList<>();
    private List<Softwere> softwereList = new ArrayList<>();
    private  Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public void addHardwere(Hardwere hardwere){
        hardwereList.add(hardwere);
    }

    public void addSoftwere(Softwere softwere){
        softwereList.add(softwere);
    }

    public List<Hardwere> getHardwereList() {
        return hardwereList;
    }

    public List<Softwere> getSoftwereList() {
        return softwereList;
    }

    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "hardwereList=" + hardwereList +
                ", softwereList=" + softwereList +
                ", cpu=" + cpu +
                '}';
    }
}
