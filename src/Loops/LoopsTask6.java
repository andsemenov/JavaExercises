package Loops;

public class LoopsTask6 {
    public static void main(String[] args) {
        int count1, count2, count3, count4, count5, count6;
        int happyTicketsCounter = 0, sum1 = 0, sum2 = 0;
        count1 = count2 = count3 = count4 = count5 = count6 = 0;
        while (!(count1 == 9 && count2 == 9 && count3 == 9 && count4 == 9 && count5 == 9 && count6 == 9)) {
            sum1 += count1 + count2 + count3;
            sum2 += count4 + count5 + count6;
            if (sum1 == sum2) {
                happyTicketsCounter++;
            }
            sum1 = sum2 = 0;
            count1 ++;
            if (count1 == 10) {
                count1 = 0;
                count2 ++;
                if (count2 == 10) {
                    count2 = 0;
                    count3 ++;
                    if (count3 == 10) {
                        count3 = 0;
                        count4 ++;
                        if (count4 == 10) {
                            count4 = 0;
                            count5 ++;
                            if (count5 == 10) {
                                count5 = 0;
                                count6 ++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("There are " + happyTicketsCounter + " happy tickets.");
    }
}

//Задача 6. В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
//Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
// «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
// как, например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю
// каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
// С помощью программы подсчитайте сколько счастливых билетов в одном рулоне.
