package junit5;

public class Gentleman {
//    public String sayHello(String name){
//        return "Hello " + name;
//    }
    //public String sayHello(String name){
    //    return "" + name;
    //}
    public String sayHello(String name){
        if(name == null){
            return "Hello Anonymus";
        }else {
            return "Hello " + name;
        }
    }
}
