package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for(String i: args) {
            if(i.equals("/list")) {
                System.out.println("Listázás");
            }
            else if (i.equals("/add")) {
                System.out.println("Hozzáadás");
            }
            else if(i.equals("/delete")) {
                System.out.println("Törlés");
            }else {
                System.out.println("Ismeretlen művelet");
            }
        }

    }
}
