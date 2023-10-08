package com.mycompany.practice;

import java.util.Comparator;

/**
 * Компаратор сравнения транспортов по мощности их двигателей
 * @author DmLutf
 * @param <T> Наследует класс CombustionEngineTransport
 */
public class PowerComparator<T extends CombustionEngineTransport> 
        implements Comparator<T> {
    /**
     * Сравнивает машины по величине мощности их двигателя
     * @param a Первая машина
     * @param b Вторая машина
     * @return -1, 0, 1 - меньше, равно, больше соответственно
     */
    @Override
    public int compare(T a, T b) {
        double powerA = a.getEngine().getPower();
        double powerB = b.getEngine().getPower();
        
        if (powerA > powerB) {
            return 1;
        }
        if (powerA < powerB) {
            return -1;
        }
        return 0;
    }
}
