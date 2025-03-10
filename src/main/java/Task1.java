public class Task1 {
    private int param1;
    private int param2;

    public Task1(String param1, String param2) {
        this.param1 = Integer.parseInt(param1);
        this.param2 = (param2.isBlank()) ? 0 : Integer.parseInt(param2);
    }

    public void compareNumbers(){
        char comparisonSymbol = (param1 > param2)
                ? '>'
                : (param1 < param2)
                    ? '<'
                    : '=';
        System.out.println(param1 + " " + comparisonSymbol + " " + param2);
    }

    public void calcAndPrintArithmeticOperations(){
        System.out.printf("%d + %d = %d%n", param1, param2, param1 + param2);

        System.out.printf("%d - %d = %d%n", param1, param2, param1 - param2);

        System.out.printf("%d * %d = %d%n", param1, param2, param1 * param2);

        if (param2 != 0) {
            if (param1 % param2 == 0)
                System.out.printf("%d / %d = %d%n",
                        param1, param2, param1 / param2);

            else System.out.printf("%d / %d = %.2f%n",
                    param1, param2, (float) param1 / param2);
        }
        else {
            System.out.println("На 0 не делим");
        }
    }
}