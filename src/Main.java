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
        String whitespace = " ";
        String fullName = lastName + whitespace + firstName + whitespace + middleName;
        char[] fullName2 = fullName.toCharArray();
        for (int i = 0; i < fullName2.length; i++) {
            System.out.print(fullName2[i]);
        }
        System.out.println();
        // Task 1.2
        String firstName1 = "Ivan";
        firstName1 = firstName.replace("Ivan", "Ivan ");
        String middleName1 = "Ivanovich";
        String lastName1 = "Ivanov";
        lastName1 = lastName.replace("Ivanov", "Ivanov ");
        String fullName1 = lastName1 + firstName1 + middleName1;
        System.out.println("Вариант 2 -" + fullName1);

        // Task 2
//**Задание 2**
//Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф. И. О. сотрудников,
// полностью написанные заглавными буквами (верхним регистром).
//Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich” на полностью
// заглавные буквы.
//В качестве строки с исходными данными используйте строку fullName.
//Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”

        String fullName3 = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName3);

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

// task 3.2.
        String fullN = "Иванов Семён Семёнович";
        String[] fName = fullN.split(" ");
        String fNresult = "";
        for (String i : fName) {
            if (i.contains("ё")) {
                i = i.replace("ё", "е");
                fNresult += i;
            } else {
                fNresult += i;
            }
            fNresult += " ";
        }
        System.out.print("2-й вариант - Данные ФИО сотрудника — " + fNresult);
    }
}


