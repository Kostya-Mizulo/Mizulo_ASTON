public class Task2 {
    public static void compareStrings(String param1, String param2){
        if (param2.isBlank()) System.out.println("Значение второго параметра не задано");
        else {
            if (param1.equals(param2)) System.out.println("Строки идентичны");
            else System.out.println("Строки неидентичны");
        }
    }
}