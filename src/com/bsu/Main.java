package com.bsu;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        StringBuilder textBuilder = new StringBuilder();

        System.out.println("Enter the text: ");
        String line;
        while (!(line = cin.nextLine()).isEmpty()) {
            textBuilder.append(line).append('\n');
        }

        String text = StringProcessor.deleteNumbers(new String(textBuilder));

        System.out.println('\'' + text + '\'');
    }
}