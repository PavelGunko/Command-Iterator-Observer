public class Main {
    /*Создайте класс Main, продемонстрируйте работосбособность
    написанного вами класса, например как это было сделано выше.*/

    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
