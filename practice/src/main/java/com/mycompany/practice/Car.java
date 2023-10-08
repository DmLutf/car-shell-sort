package com.mycompany.practice;

/**
 * Машина, используется как данные для сортировки
 * @author DmLutf
 */
public class Car extends CombustionEngineTransport {
    private final String brand;
    private final String model;
    
    /**
     * Конструктор
     * @param brand Марка машины
     * @param model Модель машины
     * @param engine Двигатель внутреннего сгорания
     * @param fuelVolume Объем топливного бака в литрах
     * @param seatCount Количество мест
     * @param wheelCount Количество колес
     * @param weight Масса в килограммах
     * @param price Цена в рублях
     */
    public Car(String brand, String model, CombustionEngine engine, 
            double fuelVolume, int seatCount, int wheelCount, double weight, 
            double price) {
        super(engine, fuelVolume, seatCount, wheelCount, weight, price);
        this.brand = brand;
        this.model = model;
    }
    
    /**
     * Получить строковое значение марки машины
     * @return Марка машины
     */
    public String getBrand() {
        return brand;
    }
    
    /**
     * Получить строковое значение модели машины
     * @return Модель машины
     */
    public String getModel() {
        return model;
    }
    
    /**
     * Получить строковое значение типа кузова машины, вычисляется 
     * из количества мест в машине
     * @return Тип кузова
     */
    public String getType() {
        if(getSeatCount() == 1) {
            return "racing";
        }
        if(getSeatCount() > 1 && getSeatCount() < 4) {
            return "coupe";
        }
        if(getSeatCount() > 3 && getSeatCount() < 6) {
            return "sedan";
        }
        return "limousine";
    }
    
    /**
     * Перевод машины в строку
     * @return Строковое значение машины
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append(getBrand()).append(" ").append(getModel())
                .append(":\n");
        builder.append("\tОбъем двигателя: ")
                .append(getEngine().getVolume()).append(" л\n");
        builder.append("\tКрутящий момент: ")
                .append(getEngine().getTorque()).append(" об/мин\n");
        builder.append("\tУгловая скорость коленчатого вала: ")
                .append(getEngine().getAngularVelocity()).append(" рад/с\n");
        builder.append("\tОбъем топливного бака: ")
                .append(getFuelVolume()).append(" л\n");
        builder.append("\tКоличество мест: ")
                .append(getSeatCount()).append("\n");
        builder.append("\tКоличество колес: ")
                .append(getWheelCount()).append("\n");
        builder.append("\tМасса: ")
                .append(getWeight()).append(" кг\n");
        builder.append("\tСтоимость: ")
                .append(getPrice()).append(" руб\n");
        
        return builder.toString();
    }
    
    /**
     * Проверяет, равна ли машина другой машине, использует хеш-коды
     * @param obj Машина для сравнения
     * @return Являются ли равными
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            if (hashCode() == obj.hashCode()) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Получить хеш-код машины, зависит только от марки и модели
     * @return Хеш-код объекта
     */
    @Override
    public int hashCode() {
        return brand.hashCode() + model.hashCode();
    }
}
