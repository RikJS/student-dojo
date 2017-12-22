package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(new Name("+5 Dexterity Vest"), 10, 20));
        items.add(new Item(new Name("Aged Brie"), 2, 0));
        items.add(new Item(new Name("Elixir of the Mongoose"), 5, 7));
        items.add(new Item(new Name("Sulfuras, Hand of Ragnaros"), 0, 80));
        items.add(new Item(new Name("Backstage passes to a TAFKAL80ETC concert"), 15, 20));
        items.add(new Item(new Name("Conjured Mana Cake"), 3, 6));
        return items;
    }

    public void updateQuality(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            item.updateQuality();
        }
    }
}
