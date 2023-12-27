package com.github.prototype;

public class ButtonFactory {

    public static Button getInstance(Button prototype) {

        Button clone = new Button();
        clone.setColor(prototype.getColor());
        clone.setHeight(prototype.getHeight());
        clone.setWidth(prototype.getWidth());

        return clone;
    }
}
