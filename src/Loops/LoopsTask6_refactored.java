package Loops;

public class LoopsTask6_refactored {
    public static void main(String[] args) {
        int counter = 0;
        for (int i= 1; i <= 999999; i++) {
            int k = i;
            int firstDigit = k % 10;
            k = k - firstDigit;
            int secondDigit = k % 100/10;
            k = k - secondDigit * 10;
            int thirdDigit = k % 1000/100;
            k = k - thirdDigit * 100;
            int fourthDigit = k % 10000/1000;
            k = k - fourthDigit * 1000;
            int fifthDigit = k % 100000/10000;
            k = k - fifthDigit * 10000;
            int sixthDigit = k % 1000_000/100_000;
            if (firstDigit + secondDigit + thirdDigit == fourthDigit + fifthDigit + sixthDigit) {
                counter ++;
            }
        }
        System.out.println("There are " + counter + " happy tickets.");
    }
}

//Задача 6. В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
//Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
// «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
// как, например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю
// каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
// С помощью программы подсчитайте сколько счастливых билетов в одном рулоне.