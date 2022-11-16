public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String phone = "+924 620-33-03";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length()==10) {
          phone = '7' + phone;
        } else if (phone.length()>11) {
            throw new RuntimeException(" телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException(" телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79246203303";
        if (phone.equals(expectedPhone)) {
            System.out.println("успех");
        } else {
            System.out.println("неудача");
        }


    }
}