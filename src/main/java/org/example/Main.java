//Практическая работа №1
//Задание:Создайте программу на Java, которая
//будет запрашивать у пользователя информацию
//о студентах, такую как их имя, возраст
//и средний балл.Используя механизмы ввода данных
//в Java (например, класс Scanner), получите от
//пользователя данную информацию для нескольких
//студентов.Запишите информацию о каждом студенте
//в отдельные строки в текстовый файл "students.txt".
//Каждая строка должна содержать данные одного
//студента и быть отделена переносом строки.Для
//проверки успешной записи данных в файл, после
//завершения записи откройте файл "students.txt"
//и убедитесь, что данные сохранились
//корректно.В программе должны быть комментарии,
//поясняющие логику работы кода.
//Описать по всем пунктам со скриншотами, оформить в
//отчет. В ЕДИНОМ файле с ОГЛАВЛЕНИЕМ. Также не
//забываем о том, что в любом отчете есть Цель
//работы и вывод
package org.example;
import java.io.*;
import java.util.Scanner;
import java.io.PipedWriter;

public class Main
{

    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        try {
            // Инициализация Scanner для ввода с клавиатуры и BufferedReader для чтения строк
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Инициализация PrintWriter для записи данных в файл "Данные студентов.txt"
            PrintWriter pw = new PrintWriter("Данные студентов.txt");

            // Ввод данных о первом студенте
            System.out.print("\nВы зашли в базу данных студентов. Заполните требуемые данные.");
            System.out.print("\nВведите имя 1 студента ");
            String str = br.readLine();

            System.out.print("\nВведите возраст 1 студента ");
            int vozrast = sc.nextInt();

            System.out.print("\nВведите средний балл 1 студента ");
            double ball = sc.nextInt();

            // Ввод данных о втором студенте
            System.out.print("\nВведите имя 2 студента ");
            String str2 = br.readLine();

            System.out.print("\nВведите возраст 2 студента ");
            int vozrast2 = sc.nextInt();

            System.out.print("\nВведите средний балл 2 студента ");
            double ball2 = sc.nextInt();

            // Ввод данных о третьем студенте
            System.out.print("\nВведите имя 3 студента ");
            String str3 = br.readLine();

            System.out.print("\nВведите возраст 3 студента ");
            int vozrast3 = sc.nextInt();

            System.out.print("\nВведите средний балл 3 студента ");
            double ball3 = sc.nextInt();

            // Запись данных в файл
            pw.printf("\nДанные 1 студента: Имя:  "+ str  + "\t Возраст " + vozrast +
                    "\t Средний балл " + ball + "\nДанные 2 студента: Имя:  "+ str2  + "\tВозраст " + vozrast2 +
                    "\t Средний балл " + ball2 + "\nДанные 3 студента: Имя:  " + str3 +
                    "\t Возраст " + vozrast3 + "\t Средний балл " + ball3);
            pw.close();
        }
        catch (Exception e)
        {
            // Обработка исключения при возникновении ошибки
            System.out.print("Вы ввели неверное значение!");
        }

    }
}
