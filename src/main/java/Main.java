
public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(90, 100);
        for (Integer rand : randoms) {
            System.out.println("Случайное число: " + rand);
            if (rand == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
