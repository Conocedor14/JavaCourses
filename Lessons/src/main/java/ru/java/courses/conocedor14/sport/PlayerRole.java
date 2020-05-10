package ru.java.courses.conocedor14.sport;

public enum PlayerRole {

    /**
     * Интерфейс выбора роли игрока в команде из ограниченного числа вариантов
     */
    GOALKEEPER("вратарь"),
    DEFENDER("защитник"),
    WINGER("нападающий");

    private String name;

    PlayerRole(String name) {
        this.name = name;
    }

    /**
     * @return геттер, позволяющий узнать роль игрока
     */
    public String getName() {
        return name;
    }
}
