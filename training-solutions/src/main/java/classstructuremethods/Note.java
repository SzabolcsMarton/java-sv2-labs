package classstructuremethods;

public class Note {
    private String name;
    private String topic;
    private String textOfNote;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTextOfNote() {
        return textOfNote;
    }

    public void setTextOfNote(String textOfNote) {
        this.textOfNote = textOfNote;
    }

    public String getNoteText() {
        return "Name: " + getName() + "  ( " + getTopic() + " )  " + getTextOfNote();
    }
}
