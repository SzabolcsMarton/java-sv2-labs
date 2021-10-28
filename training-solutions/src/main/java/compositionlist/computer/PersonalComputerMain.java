package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel(R) Core(TM) i5-3210M CPU", 2.5);
        PersonalComputer personalcomputer = new PersonalComputer(cpu);

        Hardwere display = new Hardwere("display", "samsung syncmaster");
        Hardwere printer = new Hardwere("printer", "Canon");
        Softwere windows = new Softwere("windows", 10.0);
        Softwere postman = new Softwere("postman", 8.12);
        personalcomputer.addHardwere(display);
        personalcomputer.addHardwere(printer);
        personalcomputer.addSoftwere(windows);
        personalcomputer.addSoftwere(postman);

        System.out.println(personalcomputer.getHardwereList());
        System.out.println(personalcomputer.getSoftwereList());
        System.out.println(personalcomputer.getCpu());

        System.out.println(personalcomputer);





    }
}
