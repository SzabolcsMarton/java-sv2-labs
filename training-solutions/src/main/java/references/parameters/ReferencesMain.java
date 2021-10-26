package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1 = new Person("jozsi Bacsi", 30);
        Person person2 = person1;
        person2.setName("John Rambo");
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());

        // mert nem az objektum valtozott hanem a tartalma a 2 referencia ugyanarra az objektumra utal tovabbra is

        int num1 = 24;
        int num2 = num1;
        num2 += 1;
        System.out.println(num1);
        System.out.println(num2);

        // int eseten ami primitiv nem a referencia hanem az ertek megy a stackre igy num2-nek num1 valodi (24) erteket
        //adtuk igy a plusz egy a num2 valodi erteket novelte egyel.

        person2 = new Person("Misi Bacsi", 25);
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());

        //mas ertek mert az uj peldanyositasnal uj referencia keszult
    }
}
