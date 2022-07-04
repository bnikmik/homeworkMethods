import java.time.LocalDate;

public class Main {
    public static void checkLeapYear (int year){
        if ((year % 100 != 0 || year % 400 == 0) && (year % 4 == 0)) {
            System.out.println(year + " год високосный");
        }
        else System.out.println(year + " год не является високосным");
    }

    public static void checkClientOS (int clientOS,int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear){
            System.out.println("Установите  lite-версию iOS");
        }
        else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите  обычную версию iOS");
        }
        else if (clientOS == 1 && clientDeviceYear < currentYear){
            System.out.println("Установите  lite-версию Android");
        }
        else {
            System.out.println("Установите  обычную версию Android");
        }
    }

    public static int checkCountDay(int deliveryDistance) {
        int distanceFree = 20;
        int distanceStep = 40;
        return ((deliveryDistance - distanceFree) / distanceStep) + 2;
    }

    public static void displayCountDay (int countDay,int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется дней: 1");
        }
        else System.out.println("Для доставки потребуется дней: " + countDay);
    }

    public static void main(String[] args) {
        int year = 2001;
        checkLeapYear(year);
        int clientOS = 1;
        int clientDeviceYear = 2020;
        checkClientOS(clientOS,clientDeviceYear);
        int deliveryDistance = 20;
        int countDay = checkCountDay(deliveryDistance);
        displayCountDay(countDay,deliveryDistance);
    }
}