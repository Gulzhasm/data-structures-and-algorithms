package practices.arrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        customArrayList.add(4);
        customArrayList.add(5);
        customArrayList.add(4);
        customArrayList.add(5);
        System.out.println(customArrayList);
        System.out.println(customArrayList.get(2));
        customArrayList.remove(2);
        System.out.println(customArrayList);
    }
}
