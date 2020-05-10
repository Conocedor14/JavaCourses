package ru.java.courses.conocedor14.sport;

public abstract class Athlete implements ScoringPlayer {

    //ПОЛЯ
    /**
     * Имя игрока
     */
    private String name;

    /**
     * Статус игрока (игрок основного состава / запасной игрок)
     */
    private boolean active;

    private PlayerStatus status;

    /**
     * Амплуа (роль) игрока игрока (вратарь / защитник / нападающий)
     */
    private PlayerRole role;

    private int goals;

    //КОНСТРУКТОРЫ
    /**
     * Конструктор
     */
    public Athlete(String name, PlayerRole role) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У игрока должно быть имя!");
        }
        this.name = name;
        if (role == null) {
            throw new IllegalArgumentException("У игрока должна быть указана роль!");
        }
        this.role = role;
        this.status = PlayerStatus.MAIN_PLAYER;
        this.active = status == PlayerStatus.MAIN_PLAYER;
    }

    //МЕТОДЫ

    /**
     * Геттер, позволяющий узнать имя игрока
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер, позволяющий изменить имя игрока
     */
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У игрока должно быть имя!");
        }
        this.name = name;
    }

    /**
     * Геттеры, позволяющие узнать статус игрока
     */
    public String getStatus() {
       return status.getName();
    }

    public boolean isActive() {
        return active;
    }

    /**
     * Сеттеры, позволяющие изменить статус игрока
     */
    public void setStatus(PlayerStatus status) {
        this.status = status;
        this.active = status == PlayerStatus.MAIN_PLAYER;
    }

    public void setActive(boolean active) {
        this.active = active;
        this.status = active ? PlayerStatus.MAIN_PLAYER : PlayerStatus.ODD_PLAYER;
    }

    /**
     * Геттер, позволяющий узнать амплуа (роль) игрока
     */
    public String getRole() {
        return role.getName();
    }

    /**
     * Сеттер, позволяющий изменить амплуа (роль) игрока
     */
    public void setRole(PlayerRole role) {
        if (role == null) {
            throw new IllegalArgumentException("У игрока должна быть указана роль!");
        }
        this.role = role;
    }

    /**
     * Переопределение методов score и getScore из интерфейса ScoringPlayer
     */

    /**
     * Игрок забивает гол
     */
    @Override
    public void score() {
        if(isActive()) {
            goals++;
        } else {
            throw new UnsupportedOperationException("Запасные игроки не могут забивать голы!");
        }
    }

    /**
     * Запросы количества голов, забитых игроком
     */
    @Override
    public int getScore() {
        return goals;
    }

    public int getGoals() {
        return goals;
    }

    /**
     * Стандартный вывод информации об игроке
     */
    public String toString() {
        return "Игрок: имя: " + name + ", амплуа (роль): " + role.getName() + ", статус: " + status.getName() +
                ", голов забито: " + goals;
    }
}
