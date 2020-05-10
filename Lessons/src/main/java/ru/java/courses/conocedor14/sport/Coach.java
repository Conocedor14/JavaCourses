package ru.java.courses.conocedor14.sport;

public class Coach {

    //ПОЛЯ
    /**
     * Имя тренера
     */
    private String name;

    /**
     * Опыт тренера в годах
     */
    private int experience;

    //КОНСТРУКТОРЫ
    /**
     * Конструктор
     */
    public Coach(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У тренера должно быть имя!");
        }
        this.name = name;
        this.experience = 0;
    }

    //МЕТОДЫ

    /**
     * Геттер, позволяющий узнать имя тренера
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер, позволяющий изменить имя тренера
     */
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У тренера должно быть имя!");
        }
        this.name = name;
    }

    /**
     * Геттер, позволяющий узнать количество лет опыта тренера
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Сеттер, позволяющий изменить количество лет опыта тренера
     */
    public void setExperience(int experience) {
        if(experience < 0) {
            throw new IllegalArgumentException("Количество лет опыта тренера не может выражаться отрицательным числом!");
        }
        this.experience = experience;
    }

    /**
     * Стандартный вывод информации о тренере
     */
    public String toString() {
       return "Тренер: имя: " + name + ", опыт: " + experience +
                (((experience > 4 && experience < 21) ? " лет" :
                        (experience % 10 == 1) ? " год" :
                                ((experience % 10 > 1) && (experience % 10 < 5) ? " года" : " лет")));
    }
}
