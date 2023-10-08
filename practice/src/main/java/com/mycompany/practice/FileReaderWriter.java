package com.mycompany.practice;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

/**
 * Чтение и запись в файлы
 * @author DmLutf
 */
public class FileReaderWriter {
    /**
     * Метод загрузки списка машин из файла
     * @param filePath Путь к файлу для чтения
     * @return Список машин
     * @throws IOException Вылетает, если файл не существует
     */
    public static ArrayList<Car> load(String filePath) 
            throws IOException {
        // Попытка открыть файл
        File file = new File(filePath);
        if (!file.exists()) {
            // Ошибка, если файл не существует
            throw new IOException("File does not exist");
        }
        
        // Создание списка машин
        ArrayList<Car> cars = new ArrayList<>();
        // Создание потока для чтения из файла
        Scanner scanner = new Scanner(file);
        // Пока есть данные в следующей строке
        while (scanner.hasNextLine()) {
            // Разделяем строку на элементы, создаем массив элементов
            String[] data = scanner.nextLine().split(",");
            
            // Для удобства записываем элементы в отдельные переменные
            String brand = data[0];
            String model = data[1];
            double volume = Double.parseDouble(data[2]);
            double torque = Double.parseDouble(data[3]);
            double angularVelocity = Double.parseDouble(data[4]);
            double fuelVolume = Double.parseDouble(data[5]);
            int seatCount = Integer.parseInt(data[6]);
            int wheelCount = Integer.parseInt(data[7]);
            double weight = Double.parseDouble(data[8]);
            double price = Double.parseDouble(data[9]);
            
            // Добавляем новый объект машины в список
            cars.add(new Car(brand, model, 
                    new CombustionEngine(volume, torque, angularVelocity), fuelVolume, 
                    seatCount, wheelCount, weight, price));
        }
        
        // Возвращаем список
        return cars;
    }
    
    /**
     * Метод для записи списка машин в файл
     * @param filePath Путь к файлу для записи
     * @param cars Список машин
     * @throws IOException Вылетает, если невозможно создать файл
     */
    public static void save(String filePath, List<Car> cars)
            throws IOException {
        // Попытка открыть файл
        File file = new File(filePath);
        // Если файл не существует,
        if (!file.exists()) {
            // и не удалось создать новый файл,
            if (!file.createNewFile()) {
                // вылетает ошибка
                throw new IOException("Could not create file");
            }
        }
        
        // Попытка записать в файл
        try (PrintWriter writer = new PrintWriter(file)) {
            // Для каждой машины в списке
            for (Car car : cars) {
                // Записываем строковое значение машины в отдельную строку
                writer.println(car);
            }
        }
        catch (IOException e) {
            // Ошибка, если не удалось записать в файл
            throw new IOException("Could not write to file");
        }
    }
}
