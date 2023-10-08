package com.mycompany.practice;

/**
 * Базовый класс для всего транспорта
 * @author DmLutf
 */
public class Transport {
    private final int seatCount;
    private final int wheelCount;
    private final double weight;
    private double price;
    
    /**
     * Конструктор
     * @param seatCount Количество мест
     * @param wheelCount Количество колес
     * @param weight Масса в килограммах
     * @param price Цена в рублях
     */
    public Transport(int seatCount, int wheelCount, double weight, 
            double price) {
        this.seatCount = seatCount;
        this.wheelCount = wheelCount;
        this.weight = weight;
        this.price = price;
    }
    
    /**
     * Получить количество сидений в транспорте
     * @return Количество сидений
     */
    public final int getSeatCount() {
        return seatCount;
    }
    
    /**
     * Получить количество колес транспорта
     * @return Количество колес
     */
    public final int getWheelCount() {
        return wheelCount;
    }
    
    /**
     * Получить массу транспорта в килограммах
     * @return Масса в килограммах
     */
    public final double getWeight() {
        return weight;
    }
    
    /**
     * Получить стоимость транспорта в рублях
     * @return Стоимость в рублях
     */
    public final double getPrice() {
        return price;
    }
    
    /**
     * Переопределить стоимость транспорта в рублях
     * @param price Новая стоимость в рублях
     */
    public final void setPrice(double price) {
        this.price = price;
    }
}
