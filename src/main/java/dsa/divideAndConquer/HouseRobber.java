package dsa.divideAndConquer;

public class HouseRobber {
    //Given N number of houses along the street with some amount of money
    //Adjacent houses can not be stolen
    //find the maximum amount that can be stolen

    public static void main(String[] args) {
        int[] houses = {6, 7, 1, 30, 8, 2, 4};
        System.out.println(houseRobber(houses));
    }

    static int houseRobber(int[] houses) {
        return maxMoney(houses, 0);
    }

    private static int maxMoney(int[] houses, int currentIndex) {
        //base condition
        if (currentIndex >= houses.length) {
            return 0;
        }

        int stealCurrentHouse = houses[currentIndex] + maxMoney(houses, currentIndex + 2);
        int skipCurrentHouse = maxMoney(houses, currentIndex + 1);
        return Math.max(skipCurrentHouse, stealCurrentHouse);
    }
}
