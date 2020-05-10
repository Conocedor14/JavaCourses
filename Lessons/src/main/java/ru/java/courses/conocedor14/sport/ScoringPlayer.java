package ru.java.courses.conocedor14.sport;

public interface ScoringPlayer {

    /**
     * Игрок забивает гол
     */
    void score();

    /**
     * @return геттер, позволяющий узнать текущее количество забитых голов
     */
    int getScore();
}
