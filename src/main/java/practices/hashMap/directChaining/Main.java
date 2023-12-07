package practices.hashMap.directChaining;

public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(5);
        directChaining.insert("The");
        directChaining.insert("quick");
        directChaining.insert("brown");
        directChaining.insert("fox");
        directChaining.insert("over");
        directChaining.display();
        directChaining.removeKey("fox");
        directChaining.display();
        System.out.println(directChaining.search("fox"));
    }
}
