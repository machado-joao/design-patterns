package com.github.prototype;

import java.util.HashMap;
import java.util.Map;

public class ButtonRegistry {
    private static final Map<String, Button> REGISTRIES = new HashMap<>();

    static {

        Button blueButton = new Button();
        blueButton.setColor("Blue");
        blueButton.setHeight(20);
        blueButton.setWidth(100);
        REGISTRIES.put("Blue button", blueButton);

        Button redButton = new Button();
        redButton.setColor("Red");
        redButton.setHeight(30);
        redButton.setWidth(100);
        REGISTRIES.put("Red button", redButton);
    }

    public static Button getButton(String key) {
        return ButtonFactory.getInstance(REGISTRIES.get(key));
    }
}
