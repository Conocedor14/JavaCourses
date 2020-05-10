package ru.java.courses.conocedor14.sport;

public enum PlayerStatus {

    /**
     * Интерфейс выбора статуса игрока в команде из ограниченного числа вариантов
     */
    MAIN_PLAYER("игрок основного состава"),
    ODD_PLAYER("запасной игрок");

    private String name;

    PlayerStatus(String name) {
        this.name = name;
    }

    /**
     * @return геттер, позволяющий узнать статус игрока
     */
    public String getName() {
        return name;
    }
}
