package com.mycompany.practice;

/**
 * Транспорт на двигателе внутреннего сгорания
 * @author DmLutf
 */
public class CombustionEngineTransport extends Transport {
    private CombustionEngine engine;
    private final double fuelVolume;
    
    /**
     * Конструктор
     * @param engine Двигатель внутреннего сгорания
     * @param fuelVolume Объем топливного бака в литрах
     * @param seatCount Количество мест
     * @param wheelCount Количество колес
     * @param weight Масса в килограммах
     * @param price Цена в рублях
     */
    public CombustionEngineTransport(CombustionEngine engine, double fuelVolume, 
            int seatCount, int wheelCount, double weight, double price) {
        super(seatCount, wheelCount, weight, price);
        this.engine = engine;
        this.fuelVolume = fuelVolume;
    }
    
    /**
     * Получить двигатель транспорта
     * @return Двигатель транспорта
     */
    public CombustionEngine getEngine() {
        return engine;
    }
    
    /**
     * Поменять двигатель у транспорта
     * @param engine Новый двигатель
     * @return Старый двигатель
     */
    public CombustionEngine swapEngine(CombustionEngine engine) {
        CombustionEngine oldEngine = this.engine;
        this.engine = engine;
        return oldEngine;
    }
    
    /**
     * Получить объем топливного бака транспорта в литрах
     * @return Объем топливного бака в литрах
     */
    public double getFuelVolume() {
        return fuelVolume;
    }
}
