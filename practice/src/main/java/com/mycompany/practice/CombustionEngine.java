package com.mycompany.practice;

/**
 * Двигатель внутреннего сгорания
 * @author DmLutf
 */
public class CombustionEngine {
    private final double volume;
    private final double torque;
    private final double angularVelocity;
    
    /**
     * Конструктор
     * @param volume Объем двигателя в литрах
     * @param torque Крутящий момент в оборотах в минуту
     * @param angularVelocity Угловая скорость коленчатого вала в радианах
     * в секунду
     */
    public CombustionEngine(double volume, double torque, 
            double angularVelocity) {
        this.volume = volume;
        this.torque = torque;
        this.angularVelocity = angularVelocity;
    }
    
    /**
     * Получить рабочий объем двигателя в литрах
     * @return Объем двигателя в литрах
     */
    public double getVolume() {
        return volume;
    }
    
    /**
     * Получить крутящий момент двигателя в оборотах в минуту
     * @return Крутящий момент в оборотах в минуту
     */
    public double getTorque() {
        return torque;
    }
    
    /**
     * Получить угловую скорость коленчатого вала двигателя в радианах в секунду
     * @return Угловая скорость коленчатого вала в радианах в секунду
     */
    public double getAngularVelocity() {
        return angularVelocity;
    }
    
    /**
     * Получить мощность двигателя, вычисляется как произведение крутящего
     * момента на угловую скорость
     * @return Мощность двигателя
     */
    public double getPower() {
        return torque * angularVelocity;
    }
}
