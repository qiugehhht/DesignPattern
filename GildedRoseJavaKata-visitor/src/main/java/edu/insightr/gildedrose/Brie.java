package edu.insightr.gildedrose;

public class Brie implements ItemStrategy {

    @Override
    public void NewUpdate(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}