package org.joyofcoding.objectcalisthenics.assertions;

import org.assertj.core.api.AbstractIterableAssert;
import org.assertj.core.api.Assertions;
import org.joyofcoding.objectcalisthenics.Item;
import org.joyofcoding.objectcalisthenics.Name;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.extractProperty;

public class ItemsAssert extends AbstractIterableAssert<ItemsAssert, Iterable<Item>, Item> {

    protected ItemsAssert(Iterable<Item> actual) {
        super(actual, ItemsAssert.class);
    }

    public static ItemsAssert assertThat(Iterable<Item> actual) {
        return new ItemsAssert(actual);
    }

    public ItemsAssert containsOnlyItemNames(Name... names) {
        isNotNull();

        String[] nameValues = new String[names.length];
        for(int i=0; i<names.length; i++) {
            nameValues[i] = names[i].getValue();
        }

        Iterable<String> actualItemNames = extractProperty("name.value", String.class)
                .from(actual);

        Assertions
                .assertThat(actualItemNames)
                .containsOnly(nameValues);

        return this;
    }

    public ItemsAssert containsOnlyItemQualities(Integer... qualities) {
        isNotNull();

        Iterable<Integer> actualItemQualities = extractProperty("quality", Integer.class)
                .from(actual);
        Assertions.assertThat(actualItemQualities).containsOnly(qualities);

        return this;
    }

    public ItemsAssert containsOnlyItemSellIns(Integer... sellIns) {
        isNotNull();

        Iterable<Integer> actualItemSellIns = extractProperty("sellIn", Integer.class)
                .from(actual);
        Assertions.assertThat(actualItemSellIns).containsOnly(sellIns);

        return this;
    }
}
