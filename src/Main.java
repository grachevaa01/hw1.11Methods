public class Main {
    public static void main(String[] args) {
        isLeapYear(2023);
        isLeapYear(2020);
        getAppLink(2015,0);
        int deliveryDays = getDeliveryDays(95);
        if (deliveryDays < 0 ) {
            System.out.println("Доставка недоступна");
        }else {
            System.out.println("Доставка займет " + deliveryDays + " дня");
        }
    }
        public static void isLeapYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — не високосный год");
            }
        }
    public static void getAppLink(int manufacturingYear, int os){
        System.out.printf("Установите %s версию приложения для %s по ссылке%n", getAppVariant(manufacturingYear) ,getOsString(os));
    }
    public static String getOsString (int os){
        if (os ==0){
            return "IOS";
        } else {
            return "Android";
        }

    }
    public static String getAppVariant (int year){
        if (year >2015){
            return "полную";
        }else {
            return "облегченную";
        }
    }
    public static int getDeliveryDays (int distance){
        if (distance <20){
            return 1;
        } else if ( distance <60) {
            return 2;
        }else if (distance <100) {
            return 3;
        }
        return -1;

    }


    }

