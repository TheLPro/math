package me.thelpro.math.party;

import java.util.HashMap;
import java.util.Map;

public class Party {

    int adults;
    int children;

    public Party(int adults, int children) {
        this.adults = adults;
        this.children = children;
    }

    public int adults() {
        return adults;
    }

    public int children() {
        return children;
    }

    public void adults(int adults) {
        this.adults = adults;
    }

    public void children(int children) {
        this.children = children;
    }

    public int getPlates() {
        int plates = adults + children;
        plates = plates * 2 + 5;
        return plates;
    }
    public int getTables() {
        int a = adults + children;
        a = (int) Math.ceil(a / 4);
        int b = adults + children;
        b = (int) Math.ceil(b / 10);
        return a + b;
    }
    public int getChairs() {
        return adults + children;
    }
    public int getPizzas() {
        int a = 3 * adults;
        int b = 2 * adults;
        int c = a+b;
        return (int) Math.ceil((double) c / 8);
    }
    public Map<PartyItem, Integer> getAllItems() {
        Map<PartyItem, Integer> items = new HashMap<PartyItem, Integer>(4);
        items.put(PartyItem.PLATES, getPlates());
        items.put(PartyItem.TABLES, getTables());
        items.put(PartyItem.CHAIRS, getChairs());
        items.put(PartyItem.PIZZAS, getPizzas());
        return items;
    }
}
