public class Main {
    public static void main(String[] args) {
// **Задание 1**
//Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
// и бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
//Напишите четыре строки:
//первая с именем firstName — для хранения имени;
//вторая с именем middleName — для хранения отчества;
//третья с именем lastName — для хранения фамилии;
//четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//Выведите в консоль фразу: “ФИО сотрудника — ….”
//В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.


        // Task 1.1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        char[] fullNamefinal = fullName.toCharArray();
        for (int i = 0; i < fullNamefinal.length; i++) {
            System.out.print(fullNamefinal[i]);
        }
        System.out.println();

        // Task 1.2
        String firstNameSecondOption = "Ivan";
        String middleNameSecondOption = "Ivanovich";
        String lastNameSecondOption = "Ivanov";
        String fullNameSecondOption = lastNameSecondOption + " " + firstNameSecondOption + " " + middleNameSecondOption;
        System.out.println("Вариант 2 -" + fullNameSecondOption);

        // Task 2
//**Задание 2**
//Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф. И. О. сотрудников,
// полностью написанные заглавными буквами (верхним регистром).
//Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich” на полностью
// заглавные буквы.
//В качестве строки с исходными данными используйте строку fullName.
//Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”

        //String fullName3 = fullNamefinal.toUpperCase();
        //System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName3);


        String fullNameCapitelLatters = fullNameSecondOption.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameCapitelLatters);


        // task 3
        // **Задание 3**
        //Система, в которой мы работаем, не принимает символ “ё”.
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”

// task 3.1.
        String fullName5 = "Иванов Семён Семёнович";
        fullName5 = fullName5.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName5);

    }
}


