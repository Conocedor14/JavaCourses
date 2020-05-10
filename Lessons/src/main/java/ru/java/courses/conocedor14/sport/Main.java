package ru.java.courses.conocedor14.sport;

public class Main {

    public static void main(String[] args) {

        FootballPlayer footballPlayer01 = new FootballPlayer("Лионель Месси", PlayerRole.WINGER);

        FootballPlayer footballPlayer02 = new FootballPlayer("Луис Суарес", PlayerRole.WINGER);

        FootballPlayer footballPlayer03 = new FootballPlayer("Арда Туран", PlayerRole.WINGER);

        FootballPlayer footballPlayer04 = new FootballPlayer("Марк Андре Тер Штеген", PlayerRole.GOALKEEPER);

        Coach coach = new Coach("Хосеп Гвардьола");


        FootballTeam team = new FootballTeam("Barcelona FC");
        team.setCoach(coach);
        team.addPlayers(footballPlayer01, footballPlayer02, footballPlayer03);
        team.addPlayer(footballPlayer04);
        team.removePlayer(footballPlayer03);

        footballPlayer01.score();
        footballPlayer01.score();
        footballPlayer02.score();
        footballPlayer02.score();
        footballPlayer03.score();
        footballPlayer03.score();
        footballPlayer01.score();
        footballPlayer01.score();
        footballPlayer01.score();
        footballPlayer01.score();
        footballPlayer02.score();
        footballPlayer02.score();

        System.out.println(footballPlayer01.toString());
        System.out.println(footballPlayer02.toString());
        System.out.println(footballPlayer03.toString());
        System.out.println(footballPlayer04.toString());
        System.out.println(coach.toString());

        System.out.println("\n");
        System.out.println("\n" + team.toString());

    }
}
