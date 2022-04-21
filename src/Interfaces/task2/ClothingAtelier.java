package Interfaces.task2;

public class ClothingAtelier {
   public void dressMan(Clothing[] clothings) {
       System.out.println("Men Clothes in the range:");
       for (Clothing clothing:clothings) {
           if (clothing instanceof MenClothing) {
               ((MenClothing) clothing).dressMan();
           }
       }
   }

    public void dressWoman(Clothing[] clothings) {
        System.out.println("Woman Clothes in the range:");
        for (Clothing clothing:clothings) {
            if (clothing instanceof WomenClothing) {
                ((WomenClothing) clothing).dressWoman();
            }
        }
    }
    
}

//Создать класс ClothingAtelier, содержащий методы dressWoman(),
//// dressMan(), на вход которых будет поступать массив, содержащий все типы одежды. Метод dressWoman() выводит
//// на консоль всю информацию о женской одежде. Метод dressMan() выводит на консоль всю информацию о мужской одежде.