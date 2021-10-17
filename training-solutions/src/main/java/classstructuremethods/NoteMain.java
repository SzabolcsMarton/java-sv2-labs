package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Szabolcs");
        note.setTopic("Java");
        note.setTextOfNote("Java is amasing!");

        System.out.println(note.getNoteText());
    }
}
