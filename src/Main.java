import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        int[] first = new int[3];
        first[0] = -1;
        first[1] = 2;
        first[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Элемент массива c индексом " + i + " имеет знечние " + first[i] + "%n");
        }
        float[] two = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++) {
            System.out.println(" Значение элемента " + two[i]);
        }
        float[] three = {1.356f, 4.786f, 4.78754f, 9.986f, 5.654f, 6.6476f};
        for (int i = 0; i < three.length; i++) {
            System.out.println(three[i]);
        }

    }

    public static void task3() {
        int[] first = new int[]{-1, 2, 3};
        float[] two = {1.57f, 7.654f, 9.986f};

        float[] three = {1.356f, 4.786f, 4.78754f, 9.986f, 5.654f, 6.6476f};
        for (int i = three.length - 1; i > 0; i--) {
            System.out.println(" Эначение элементы массива three с индексом " + i + " имеет значение " + three[i]);
        }

    }

    public static void task4() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Введите число элементов массива : ");
            int a = scanner.nextInt();
            int[] massivCase = new int[a];
            for (int i = 0; i < a; i++) {
                System.out.println("Введите элемент массива с порядковым номером : " + (i + 1));
                massivCase[i] = scanner.nextInt();
            }
            for (int i = 0; i < a; i++) {                                                                        // поверка заполнения элементов массива
                System.out.println("Элемент массива " + massivCase[i] + " с порядковым номером : " + (i + 1) + " проверка заполнения массива");   // проверка заполнения элементов массива
            }
            for (int i = 0; i < a; i++) {
                if (massivCase[i] % 2 != 0) {
                    massivCase[i] = massivCase[i] + 1;
                }
            }
            for (int i = 0; i < a; i++) {
                System.out.println("Результат преобразования элемента массива : "+ (i +1) +  " в четное число " + massivCase[i]);
            }
        }
    }
}

