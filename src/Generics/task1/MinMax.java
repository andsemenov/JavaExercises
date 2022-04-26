package Generics.task1;

public class MinMax <E extends Comparable<E>> {
    public E[] array;

    public MinMax(E[] array) {
        this.array = array;
    }
    public E findMin() {
        E min = array[0];
        for(E element:array) {
            if(min.compareTo(element)>0) {
                min = element;
            }
        }
        return min;
    }
    public  E findMax() {
        E max = array[0];
        for( E element:array) {
            if(max.compareTo(element)<0) {
                max = element;
            }
        }
        return max;
    }
}
