public class Main {
    public static void countYear( int numbers){

            if (numbers % 4 == 0 && numbers % 100 != 0 ){
                System.out.println(numbers + " - високосный год");
            }else if (numbers % 400 ==0){
                System.out.println(numbers + " - високосный год");
            }else {
                System.out.println(numbers + " - невисокосный год");
        }
    }
    public static void applicationSelection(int clientOS1,int clientDeviceYear){
        if (clientOS1 == 0 && clientDeviceYear >=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS1 == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Такого не существует");
        }
    }
    public static void deliveryTime(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + 1 );
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2 );
        }else if (deliveryDistance >60 && deliveryDistance <=100 ){
            System.out.println("Потребуется дней: " + 3 );
        }else {
            System.out.println("Мы туда не доставляем(");
        }
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] year = {2018, 2019, 2022, 2023, 2024, 2000, 1900, 1800, 1804, 1904, 1365, 1999, 1, 1584};
        for (int i = 0; i < year.length; i++) {
            countYear(year[i]);
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        int clientOS1 = 0;
        applicationSelection(clientOS1,clientDeviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        deliveryTime(deliveryDistance);

    }
}