import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double Zahl1 = EingabeZahl1();
        double Zahl2 = EingabeZahl2();
        char Operator = EingabeOperator();

        double result = berechne(Zahl1, Zahl2, Operator);
        System.out.println("Ergebnis: " + result);
    }

    public static double EingabeZahl1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die erste Zahl ein: ");
        return scanner.nextDouble();
    }

    public static char EingabeOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Operator ein (+, -, *, /): ");
        String input = scanner.nextLine();

        if (input.length() != 1 || "+-*/".indexOf(input.charAt(0)) == -1) {
            System.out.println("Ungültiger Operator. Nur +, -, *, / erlaubt.");
            return '\0';
        } else {
            return input.charAt(0);
        }
    }

    public static double EingabeZahl2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die zweite Zahl ein: ");
        return scanner.nextDouble();
    }

    public static double berechne(double zahl1, double zahl2, char operator) {
        switch (operator) {
            case '+':
                return zahl1 + zahl2;
            case '-':
                return zahl1 - zahl2;
            case '*':
                return zahl1 * zahl2;
            case '/':
                if (zahl2 != 0) {
                    return zahl1 / zahl2;
                } else {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                    return Double.NaN; // Not-a-Number
                }
            default:
                System.out.println("Ungültiger Operator.");
                return Double.NaN;
        }
    }
}