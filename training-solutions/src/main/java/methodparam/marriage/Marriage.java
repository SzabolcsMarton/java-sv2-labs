package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        setWomanMarriedName(woman, man.getName());
        addNewRegisterDate(woman, man, "Hazassag kotes");
    }

    private void addNewRegisterDate(Woman woman, Man man, String subject) {
        woman.addRegisterDate(new RegisterDate(subject, LocalDate.now()));
        man.addRegisterDates(new RegisterDate(subject, LocalDate.now()));
    }

    private void setWomanMarriedName(Woman woman, String husbandName) {
        String[] nameParts = husbandName.split(" ");
        woman.setName(nameParts[0] + "né " + woman.getName());
    }


}
