package com.mycompany.practice;

import java.util.Comparator;

import java.util.ArrayList;

import java.io.IOException;
import java.util.Scanner;

/**
 * Главный класс приложения
 * @author DmLutf
 */
public class Practice {
    /**
     * Запускаемая программа
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        // Задание пути к файлу для загрузки данных
        String loadPath = "./data.txt";
        
        // Создание списка машин
        ArrayList<Car> cars;
        try {
            // Попытка загрузить данные из файла, выводит сообщение в случае успеха
            cars = FileReaderWriter.load(loadPath);
            System.out.println("Data loaded succesfully from " + loadPath);
        }
        catch(IOException e) {
            // В случае ошибки, выводит сообщение и закрывает программу
            System.err.println(e.getMessage());
            return;
        }
        
        // Выбор данных для сортировки
        System.out.println("Select sort: ");
        System.out.println("1. Sort by price");
        System.out.println("2. Sort by engine power");
        System.out.println("3. Sort by name");
        
        Scanner choice = new Scanner(System.in);
        Comparator comp;
        // Если пользователь ввел целое число,
        if (choice.hasNextInt()) {
            // выбирается компаратор, основываясь на выборе пользователя:
            switch (choice.nextInt()) {
                case 1:
                    // 1 - Выбор компаратора стоимости
                    comp = new PriceComparator<>();
                    break;
                case 2:
                    // 2 - Выбор компаратора мощности
                    comp = new PowerComparator<>();
                    break;
                case 3:
                    // 3 - Выбор компаратора названия
                    comp = new NameComparator<>();
                    break;
                default:
                    // Другое число - Ошибка и выход из программы
                    System.err.println("Not an option");
                    return;
            }
        }
        // Если пользователь ввел не число,
        else {
            // выходит ошибка, и программа закрывается
            System.err.println("Not an integer");
            return;
        }
        
        // Сортировка данных, выводит сообщение по окончании
        ShellSort.sort(cars, comp);
        System.out.println("Data sorted");
        
        // Задание пути к файлу для сохранения изменений
        String savePath = "./data_sorted.txt";
        try {
            // Попытка сохранить данные в файл, выводит сообщение в случае успеха
            FileReaderWriter.save(savePath, cars);
            System.out.println("Data saved successfully to " + savePath);
        }
        catch(IOException e) {
            // В случае ошибки, выводит сообщение
            System.err.println(e.getMessage());
        }
    }
}
