package introjunit;

public class GentleMan {

    public String sayHello(String name){
        if(name == null){
            return"Hello Anonymus";
        }else{
            return "Hello " + name;
        }
    }
}
