package org.joyofcoding.objectcalisthenics;

public class Item {
    private Name name;
    private int sellIn;
    private int quality;

    public Item(Name name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public Name getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void decreaseQuality() {
        this.quality -= 1;
    }

    public void increaseQuality() {
        this.quality += 1;
    }

    public void decreaseSellIn() {
        this.sellIn -= 1;
    }

    public void updateQuality() {
        if (!this.getName().getValue().equals("Aged Brie")
                && !this.getName().getValue().equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (!this.getName().getValue().equals("Sulfuras, Hand of Ragnaros")
                    && this.getQuality() > 0) {
                this.decreaseQuality();
            }
        } else if (this.getQuality() < 50) {
            this.increaseQuality();

            if (this.getName().getValue().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (this.getSellIn() < 11 && this.getQuality() < 50) {
                    this.increaseQuality();
                }

                if (this.getSellIn() < 6 && this.getQuality() < 50) {
                    this.increaseQuality();
                }
            }
        }

        if (!this.getName().getValue().equals("Sulfuras, Hand of Ragnaros")) {
            this.decreaseSellIn();
        }

        if (this.getSellIn() < 0) {
            if (!this.getName().getValue().equals("Aged Brie")) {

                if (this.getName().getValue().equals("Backstage passes to a TAFKAL80ETC concert")) {
                    this.setQuality(0);
                } else if (!this.getName().getValue().equals("Backstage passes to a TAFKAL80ETC concert")
                        && !this.getName().getValue().equals("Sulfuras, Hand of Ragnaros")
                        && this.getQuality() > 0) {
                    this.decreaseQuality();
                }

            } else if (this.getQuality() < 50) {
                this.increaseQuality();
            }
        }
    }
}
