package com.javase._47.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MapTest03 {

    public static void main(String[] args) {
        Set<Player> hashSet = new HashSet<>();

        Player player1 = new Player("Mert", 12);
        Player player2 = new Player("Murat", 10);
        Player player3 = new Player("Ecir", 5);
        Player player4 = new Player("Mert", 12);

        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        for (Player p : hashSet)
            System.out.println(p);
        // ID : 10 ---> İsim : Murat
        // ID : 5 ---> İsim : Ecir
        // ID : 12 ---> İsim : Mert
    }
}

class Player {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID : " + id + " ---> İsim : " + isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id &&
                Objects.equals(isim, player.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isim, id);
    }
}
