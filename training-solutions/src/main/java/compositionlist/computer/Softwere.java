package compositionlist.computer;

public class Softwere {
    private String name;
    private double nimberOfVersion;

    public Softwere(String name, double nimberOfVersion) {
        this.name = name;
        this.nimberOfVersion = nimberOfVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNimberOfVersion() {
        return nimberOfVersion;
    }

    public void setNimberOfVersion(double nimberOfVersion) {
        this.nimberOfVersion = nimberOfVersion;
    }

    @Override
    public String toString() {
        return "Softwere{" +
                "name='" + name + '\'' +
                ", nimberOfVersion=" + nimberOfVersion +
                '}';
    }
}
