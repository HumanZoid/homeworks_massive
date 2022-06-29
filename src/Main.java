public class Main {
    public static void main(String[] args) {
//        task1();
        task3();
    }
    public static void task1() {
        int [] first = new int[3];
        first[0] = -1;
        first[1] = 2;
        first[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Элемент массива c индексом " + i + " имеет знечние " + first[i] + "%n");
        }
        float [] two  = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++) {
            System.out.println(" Значение элемента " + two[i]);
        }
        float [] three = { 1.356f, 4.786f, 4.78754f, 9.986f, 5.654f, 6.6476f};
        for (int i = 0; i < three.length; i++) {
            System.out.println(three[i]);
        }

    }
    public static void task3() {
        int [] first = new  int[] {-1, 2,3};
        float [] two  = {1.57f, 7.654f, 9.986f};

        float [] three = { 1.356f, 4.786f, 4.78754f, 9.986f, 5.654f, 6.6476f};
        for ( int i = three.length - 1; i > 0; i--){
            System.out.println(" Эначение элементы массива three с индексом " + i + " имеет значение " + three[i]);
        }

    }
}