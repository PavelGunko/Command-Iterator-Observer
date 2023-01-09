import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;


/*Для генерации случайных чисел используйте встроенный класс Random.*/
public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected PrimitiveIterator.OfInt randomIterator;
    protected int min, max;

    public Randoms(int min, int max) {
        randomIterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
    }
/*Реализуйте требуемый интерфейсом Iterable метод, для чего вам может понадобиться
    создать вспомогательный класс для итератора (реализующего Iterator<Integer>) по вашему классу.*/

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return randomIterator.nextInt();
            }
        };
    }
}

