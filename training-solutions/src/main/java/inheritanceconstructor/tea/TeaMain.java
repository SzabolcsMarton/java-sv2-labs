package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Lipton", 2000);
        HerbalTea herbalTea = new HerbalTea("Mint", 2200);

        System.out.println(tea.getName() + " " + tea.getPrice());
        System.out.println(herbalTea.getName() + " " + herbalTea.getPrice());
    }
}
