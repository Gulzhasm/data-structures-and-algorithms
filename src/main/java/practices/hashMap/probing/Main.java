package practices.hashMap.probing;

public class Main {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(18);
        lp.insert("The");
        lp.insert("quick");
        lp.insert("brown");
        lp.insert("fox");
        lp.insert("over");
        lp.display();
        System.out.println(lp.search("brown"));
        lp.delete("fox");
        lp.display();
    }
}
