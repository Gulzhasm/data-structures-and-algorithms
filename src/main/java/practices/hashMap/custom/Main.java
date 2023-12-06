package practices.hashMap.custom;


public class Main {
    public static void main(String[] args) {
        HashMapFinal<String, String> mapUsingHash = new HashMapFinal();
        mapUsingHash.put("Mango", " King of fruits");
        mapUsingHash.put("Avocado", "Queen of fruits");

        System.out.println(mapUsingHash.get("Mango"));
        System.out.println(mapUsingHash);
    }
}
