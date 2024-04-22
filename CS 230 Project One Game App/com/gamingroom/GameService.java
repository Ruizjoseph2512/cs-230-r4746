package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine
 *
 * @author coce@snhu.edu
 */
public class GameService {

    private static List<Game> games = new ArrayList<>();
    private static List<Team> teams = new ArrayList<>();
    private static List<Player> players = new ArrayList<>();

    private static long nextGameId = 1;
    private static long nextTeamId = 1;
    private static long nextPlayerId = 1;

    private static GameService instance;

    private GameService() {
        // Private constructor to prevent instantiation
    }

    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    // Game methods
    public Game addGame(String name) {
        Iterator<Game> iterator = games.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            if (game.getName().equals(name)) {
                return game; // Return existing game with the same name
            }
        }

        Game game = new Game(nextGameId++, name);
        games.add(game);
        return game;
    }

    private Game getGameFromId(long id) {
        Iterator<Game> iterator = games.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

    public Game getGame(long id) {
        return getGameFromId(id);
    }

    public Game getGame(String name) {
        Iterator<Game> iterator = games.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    public int getGameCount() {
        return games.size();
    }

    // Team methods
    public Team addTeam(String name) {
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            if (team.getName().equals(name)) {
                return team; // Return existing team with the same name
            }
        }

        Team team = new Team(nextTeamId++, name);
        teams.add(team);
        return team;
    }

    private Team getTeamFromId(long id) {
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            if (team.getId() == id) {
                return team;
            }
        }
        return null;
    }

    public Team getTeam(long id) {
        return getTeamFromId(id);
    }

    public Team getTeam(String name) {
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            if (team.getName().equals(name)) {
                return team;
            }
        }
        return null;
    }

    public int getTeamCount() {
        return teams.size();
    }

    // Player methods
    public Player addPlayer(String name) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getName().equals(name)) {
                return player; // Return existing player with the same name
            }
        }

        Player player = new Player(nextPlayerId++, name);
        players.add(player);
        return player;
    }

    private Player getPlayerFromId(long id) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    public Player getPlayer(long id) {
        return getPlayerFromId(id);
    }

    public int getPlayerCount() {
        return players.size();
    }
}