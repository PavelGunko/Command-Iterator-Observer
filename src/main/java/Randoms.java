import java.util.Iterator;
import java.util.Random;


/*Для генерации случайных чисел используйте встроенный класс Random.*/
public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int min, max;


    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }
/*Реализуйте требуемый интерфейсом Iterable метод, для чего вам может понадобиться
    создать вспомогательный класс для итератора (реализующего Iterator<Integer>) по вашему классу.*/

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int i = max - min + 1;
                return random.nextInt(Math.abs(i)) + min;
            }
        };
    }

}
