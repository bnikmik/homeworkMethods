import java.time.LocalDate;

public class Main {
    public static void checkLeapYear (int a){
        if ((a % 100 != 0 || a % 400 == 0) && (a % 4 == 0)) {
            System.out.println(a + " год високосный");
        }
        else System.out.println(a + " год не является високосным");
    }

    public static void checkClientOS (int a,int b) {
        int currentYear = LocalDate.now().getYear();
        if (a == 0){
            if (b<currentYear) {
                System.out.println("Установите  lite-версию iOS");
            }
            else System.out.println("Установите  обычную версию iOS");
        }
        if (a == 1) {
            if (b<currentYear) {
                System.out.println("Установите  lite-версию Android");
            }
            else System.out.println("Установите  обычную версию Android");
        }

    }
    public static int checkCountDay(int deliveryDistance) {

        int distanceFree = 20;
        int distanceStep = 40;

        return ((deliveryDistance - distanceFree) / distanceStep) + 2;
    }
    public static void main(String[] args) {

        int year = 2001;
        checkLeapYear(year);

        int clientOS = 0;
        int clientDeviceYear = 2022;
        checkClientOS(clientOS,clientDeviceYear);

        int deliveryDistance = 95;
        int countDay = checkCountDay(deliveryDistance);
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется дней: 1");
        }
        else System.out.println("Для доставки потребуется дней: " + countDay);

    }
}