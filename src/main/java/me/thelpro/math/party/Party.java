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
    public int getPeople() {
        return adults + children;
    }
    public int getPlates() {
        int plates = adults + children;
        int extra = plates / 10;
        plates = plates * 2;
        return plates + extra;
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
    public int getEggs() {
        int p = adults + children;
        int e = (int) Math.ceil((double) p / 3);
        int extra = (int) Math.ceil((double) p / 10);
        return p + extra;
    }
    public int getSpoons() {
        int p = adults + children;
        return (int) Math.ceil((double) p / 3);
    }
    public Map<PartyItem, Integer> getAllItems() {
        Map<PartyItem, Integer> items = new HashMap<PartyItem, Integer>(4);
        items.put(PartyItem.PEOPLE, getPeople());
        items.put(PartyItem.PLATES, getPlates());
        items.put(PartyItem.TABLES, getTables());
        items.put(PartyItem.CHAIRS, getChairs());
        items.put(PartyItem.PIZZAS, getPizzas());
        items.put(PartyItem.EGGS, getEggs());
        items.put(PartyItem.SPOONS, getSpoons());
        return items;
    }
}
