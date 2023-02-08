package me.thelpro.math.party;

import java.util.*;

public class PrintMap {
    public static void printMap(Map<PartyItem, Integer> map) {
        System.out.println(map.get(PartyItem.PLATES) + " plates");
        System.out.println(map.get(PartyItem.TABLES) + " tables");
        System.out.println(map.get(PartyItem.CHAIRS) + " chairs");
        System.out.println(map.get(PartyItem.PIZZAS) + " pizzas");
    }
}
