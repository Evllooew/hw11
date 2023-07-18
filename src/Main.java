public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        // С именем firstName — для хранения имени.
        // С именем middleName — для хранения отчества.
        // С именем lastName — для хранения фамилии.
        // С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        // Выведите в консоль фразу: «ФИО сотрудника — …».
        //  В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".

        System.out.println("Задача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());


        // Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich"
        // на полностью заглавные буквы.

        //  В качестве строки с исходными данными используйте строку fullName.

        //   Результат программы выведите в консоль в формате:
        //   "Данные ФИО сотрудника для заполнения отчета — …"

    }

    public static void task2() {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё" , "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);


        // Система, в которой мы работаем, не принимает символ «ё». Напишите программу,
        // которая заменяет символ «ё» на символ «е».

        //В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".

        //   Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».


    }
}