package com.mycompany.practice;

import java.util.Comparator;

/**
 * Компаратор сравнения машин по их названиям
 * @author DmLutf
 * @param <T> Наследует класс Car
 */
public class NameComparator<T extends Car> 
        implements Comparator<T> {
    /**
     * Сравнивает машины лексически по их марке и модели
     * @param a Первая машина
     * @param b Вторая машина
     * @return -1, 0, 1 - меньше, равно, больше соответственно
     */
    @Override
    public int compare(T a, T b) {
        // Сравнение марок
        String brandA = a.getBrand();
        String brandB = b.getBrand();
        
        if (brandA.compareTo(brandB) != 0) {
            return brandA.compareTo(brandB);
        }
        
        // Если марки равны, сравнение моделей
        String modelA = a.getModel();
        String modelB = b.getModel();
        
        return modelA.compareTo(modelB);
    }
}
