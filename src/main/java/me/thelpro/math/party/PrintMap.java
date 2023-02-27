package me.thelpro.math.party;

import java.util.Map;

public class PrintMap {
    public static void printMap(Map<PartyItem, Integer> map) {
        System.out.println(map.get(PartyItem.PEOPLE) + " people");
        System.out.println(map.get(PartyItem.PLATES) + " plates");
        System.out.println(map.get(PartyItem.TABLES) + " tables");
        System.out.println(map.get(PartyItem.CHAIRS) + " chairs");
        System.out.println(map.get(PartyItem.PIZZAS) + " pizzas for PLN " + map.get(PartyItem.PIZZAS) * 26.90f);
        System.out.println(map.get(PartyItem.EGGS) + " eggs for PLN " + map.get(PartyItem.EGGS) / 10 * 10.49f);
        System.out.println(map.get(PartyItem.SPOONS) + " spoons");
        System.out.println(map.get(PartyItem.CUPS) + " cups");
        System.out.println(map.get(PartyItem.PIZZAS) + " drinks for PLN " + map.get(PartyItem.PIZZAS) * 2.29f);
    }
}