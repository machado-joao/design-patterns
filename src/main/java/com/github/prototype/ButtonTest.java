package com.github.prototype;

public class ButtonTest {

    public static void main(String[] args) {

        Button blueButton = ButtonRegistry.getButton("Blue button");
        System.out.println(blueButton);

        Button redButton = ButtonRegistry.getButton("Red button");
        System.out.println(redButton);
    }

}
