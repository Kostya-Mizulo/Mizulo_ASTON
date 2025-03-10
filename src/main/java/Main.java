public class Main {
    public static void main(String[] args) {
        String param1;
        String param2;

        if (args.length == 2) {
            param1 = args[0];
            param2 = args[1];
        } else {
            param1 = ConsolInput.scanValue(
                    "Введите первый параметр (task_1, task_2) или нажмите Enter (task_3): "
            );
            param2 = (!param1.isBlank())
                    ? ConsolInput.scanValue("Введите второй параметр: ")
                    : ""
            ;
        }

        Tasks task;
        if (param1.isBlank()) {
            task = Tasks.TASK_3;
        } else {
            task = (param1.matches("-?\\d+"))
                    ? Tasks.TASK_1
                    : Tasks.TASK_2;
        }

        switch (task) {
            case TASK_1:
                Task1 task1 = new Task1(param1, param2);
                task1.compareNumbers();
                task1.calcAndPrintArithmeticOperations();
                break;
            case TASK_2:
                Task2.compareStrings(param1, param2);
                break;
            case TASK_3:
                Task3.printEvenNumbers();
                break;
        }
    }
}