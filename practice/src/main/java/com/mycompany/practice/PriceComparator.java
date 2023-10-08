package com.mycompany.practice;

import java.util.Comparator;

/**
 * Компаратор сравнения транспорта по стоимости
 * @author DmLutf
 * @param <T> Наследует класс Transport
 */
public class PriceComparator<T extends Transport> 
        implements Comparator<T> {
    /**
     * Сравнивает транспорт по стоимости
     * @param a Первый транспорт
     * @param b Второй транспорт
     * @return -1, 0, 1 - меньше, равно, больше соответственно
     */
    @Override
    public int compare(T a, T b) {
        double priceA = a.getPrice();
        double priceB = b.getPrice();
        
        if (priceA > priceB) {
            return 1;
        }
        if (priceA < priceB) {
            return -1;
        }
        return 0;
    }
}
