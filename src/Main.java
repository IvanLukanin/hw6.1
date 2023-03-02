public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Ф.И.О сотрудника " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullname = "Ivanov Ivan Ivanovich";
        String upperFullname = fullname.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullname);
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullname = "Семёнов Семён Семёнович";
        String replaceFullname = fullname.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + replaceFullname);
    }
}