package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SimpleInvoice {
    private final List<SimpleItem> items = new ArrayList<>();

    public void addItem(SimpleItem simpleItem) {
        items.add(simpleItem);
    }

    public boolean removeItem(SimpleItem simpleItem) {
        return items.remove(simpleItem);
    }

    public double getValueToPay() {
        return items.stream()
                .collect(Collectors.summingDouble(SimpleItem::getValue));
    }
}
