package org.example;

import json.JsonService;
import information.Game;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Game> games = new ArrayList<>();

    public static void main(String[] args) {
        initializeGames();

        JsonService jsonService = new JsonService();
        String json = jsonService.convertToJson(games);

        System.out.println(json);
        jsonService.saveJson(json);
    }

    public static void initializeGames() {
        if (!games.isEmpty()) return;

        games.add(Game.builder().name("Expedition 33").music("Lumiere").difficulty("HARD").MetaScore(99).Year(2025).build());
        games.add(Game.builder().name("Elden ring").music("org.example.Main theme").difficulty("HARD").MetaScore(95).Year(2022).build());
        games.add(Game.builder().name("STAR WARS: A GUERRA DOS CLONES").music("DUEL OF FATES").difficulty("HARD").MetaScore(88).Year(2008).build());
        games.add(Game.builder().name("Hades").music("org.example.Main theme").difficulty("HARD").MetaScore(90).Year(2016).build());
        games.add(Game.builder().name("Person 5").music("I belive").difficulty("Median").MetaScore(70).Year(2019).build());
    }

    public static List<Game> getGames() {
        return games;
    }
}
