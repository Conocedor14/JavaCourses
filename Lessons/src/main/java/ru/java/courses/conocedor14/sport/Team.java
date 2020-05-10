package ru.java.courses.conocedor14.sport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Team<T extends FootballPlayer & ScoringPlayer> {

    //ПОЛЯ
    /**
     * Название команды
     */
    private String name;

    /**
     * Тренер команды
     */
    private Coach coach;

    /**
     * Список игроков команды, выполненный в виде массива
     */
   private ArrayList<T> players = new ArrayList<>();

    /**
     * Максимально возможное число игроков в команде
     */
    private static final int MAXIMUM_NUMBER_OF_PLAYERS = 20;

    //КОНСТРУКТОРЫ
    /**
     * Конструктор
     */
    public Team(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У команды должно быть название!");
        }
        this.name = name;
    }

    //МЕТОДЫ
    /**
     * Геттер, позволяющий узнать имя тренера
     */
    public Coach getCoach() {
        return coach;
    }

    /**
     * Сеттер, позволяющий изменить имя тренера
     */
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    /**
     * Геттер, позволяющий узнать название команды
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер, позволяющий изменить название команды
     */
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У команды должно быть название!");
        }
        this.name = name;
    }

    /**
     * Геттер, позволяющий узнать максимально разрешенное количество игроков в команде
     */
    public int getMaxPlayersCount() {
        return MAXIMUM_NUMBER_OF_PLAYERS;
    }

    /**
     * Добавление нескольких игроков в команду
     */
    public void addPlayers(T... newPlayers) {
        if(players.size() + newPlayers.length < MAXIMUM_NUMBER_OF_PLAYERS) {
            players.addAll(Arrays.asList(newPlayers));
        }
        else {
            throw new IllegalArgumentException("Нельзя добавить новых игроков! В команде уже " +
                    MAXIMUM_NUMBER_OF_PLAYERS + " игроков. Состав команды будет переполнен!");}
    }

    /**
     * Добавление отдельного игрока в команду
     */
    public void addPlayer(T player) {
        if(players.size() < MAXIMUM_NUMBER_OF_PLAYERS) {
            players.add(player);
        }
        else {
            throw new IllegalArgumentException("Нельзя добавить нового игрока! В команде уже " +
                    MAXIMUM_NUMBER_OF_PLAYERS + " игроков. Состав команды заполнен!");}
    }

    /**
     * Удаление игрока из команды
     */
    public void removePlayer(T player) {
        players.remove(player);
    }

    /**
     * Геттер, позволяющий узнать текущее количество игроков в команде
     */
    public int getPlayersCount() {
        return players.size();
    }

    /**
     * Геттер, позволяющий узнать количество голов, забитое игроками команды
     */
    public int getScore() {
        int score = 0;
        for (T player : players) {
            score = score + player.getScore();
        }
        return score;
    }

    /**
     * Стандартный вывод информации о команде
     */
    public String toString() {
        //String[] listOfPlayers = new String[players.size()];
        return "Команда: " + getName() + "\n" + coach.toString() +
                "\nИгроки команды забили " + getScore() +
                (((getScore() > 4 && getScore() < 21) ? " голов" :
                        (getScore() % 10 == 1) ? " гол" :
                                ((getScore() % 10 > 1) && (getScore() % 10 < 5) ? " гола" : " голов"))) +
                "\nКол-во игроков в команде: " + players.size() +
                "\nСписок игроков:\n" + players.toString();
        //Пока не придумал, как вывести список игроков, чтобы описание каждого игрока начиналось с новой строки
    }

    //НЕ ПРОРАБОТАННАЯ ЧАСТЬ
    /**
     * Пока не понял, что делают методы ниже!
     */
    public ArrayList<T> getPlayers() {
        return new ArrayList<>(players);
    }

    public void setPlayers(ArrayList<T> players) {
        this.players = players;
    }
}
