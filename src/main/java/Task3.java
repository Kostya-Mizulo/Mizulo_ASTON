public class Task3 {
    public static void printEvenNumbers(){
        int[] numbersArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbersArray) {
            if (number % 2 == 0) System.out.println(number);
        }
    }
}