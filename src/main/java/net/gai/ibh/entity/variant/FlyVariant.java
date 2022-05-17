package net.gai.ibh.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum FlyVariant {
    DEFAULT(0),
    BLUE(1);

    private static final FlyVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(FlyVariant::getId)).toArray(FlyVariant[]::new);
    private final int id;

    FlyVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static FlyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
