package Arrays2;

public class Arrays2Task5_refactored {
    public static void main(String[] args) {
        int[] array = new int[12];
        int positive = 0;
        int negative = 0;
        int length = array.length;
        for (int i = 0; i < length; i++)
        {
            int temporary;
            do
            {
                int lowRange = -10;
                int highRange = 10;
                temporary = array[i] = (int) (Math.random() * ((highRange - lowRange) + 1)) + lowRange;
            } while (temporary == 0 ||
                    (temporary < 0 && negative == (length + 1) / 2) ||
                    (temporary > 0 && positive == (length + 1) / 2));
            if ( temporary < 0 ) ++negative;
            else ++positive;
            array[i] = temporary;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
