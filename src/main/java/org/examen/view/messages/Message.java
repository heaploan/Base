package org.examen.view.messages;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static final int MESSAGE1 = 0;
    public static final int MESSAGE2 = 1;
    public static final int MESSAGE3 = 2;
    public static final int MESSAGE4 = 3;
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public final List<String> msgs = Arrays.asList(
            "Mensaje 1",
            "Mensaje 2",
            "Mensaje 3",
            "Mensaje 4"
    );

    public String getMessage(int code){
        return ANSI_BLUE + msgs.get(code) + ANSI_RESET;
    }

    public String getMessage(int code, String[] args){
        return switch (code) {
            case MESSAGE1 -> ANSI_BLUE + " " + args[1] + ANSI_RESET;
            case MESSAGE2 -> ANSI_BLUE + " " + args[1] + ANSI_RESET;
            case MESSAGE3 -> ANSI_BLUE + " " + args[1] + ANSI_RESET;
            case MESSAGE4 -> ANSI_RED + " " + args[1] + ANSI_RESET;
            default -> ANSI_RED + "Unknown Error" + ANSI_RESET;
        };
    }

}
