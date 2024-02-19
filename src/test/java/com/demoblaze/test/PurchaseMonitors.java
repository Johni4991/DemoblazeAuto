package com.demoblaze.test;

import org.junit.jupiter.api.Test;

public class PurchaseMonitors extends BaseUrl {
    @Test
    void addMonitors() {
        metodsPages.openPage()
                .clickCategories("Monitors")
                .addProduct("Apple monitor 24")
                .clickHome()
                .clickCategories("Monitors")
                .clickNext()
                .addProduct("Dell i7 8gb")
                .clickHome()
                .clickCategories("Monitors")
                .openCart("Products", "Dell i7 8gb")
                .clickHome()
                .openCart("Products", "Apple monitor 24");
    }
}
