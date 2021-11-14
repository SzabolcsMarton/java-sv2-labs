package meetingrooms;

public class MeetingRoom {

    private String name;
    private int length;
    private int width;

    public MeetingRoom(String name, int lenght, int width) {
        this.name = name;
        this.length = lenght;
        this.width = width;
    }

    public int getArea() {
        return length * width;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
