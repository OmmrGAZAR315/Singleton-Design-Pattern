import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setName("Singleton");
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getName());
    }
}