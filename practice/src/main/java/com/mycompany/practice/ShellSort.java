package com.mycompany.practice;

import java.util.Comparator;
import java.util.Collections;
import java.util.List;

/**
 * Сортировка методом Шелла
 * @author 1
 */
public class ShellSort {
    /**
     * Метод сортировки списка по алгоритму Шелла
     * @param l Список сортируемых данных
     * @param comp Используемый для сравнения компаратор
     */
    public static void sort(List l, Comparator comp) {
        // Начальный промежуток равен половине длины списка, с каждой итерацией
        // будет делиться на 2
        for (int d = l.size() / 2; d > 0; d /= 2) {
            // Сортируем вставками элементы списка с определенным промежутком
            for (int i = d; i < l.size(); i++) {
                // Сравниваем текущий элемент с предыдущим элементом 
                // на расстоянии d; если один больше другого, меняем элементы 
                // местами, иначе прекращаем цикл
                for (int j = i; 
                        j - d >= 0 && comp.compare(l.get(j - d), l.get(j)) > 0;
                        j -= d) {
                    Collections.swap(l, j, j - d);
                }
            }
        }
    }
}
