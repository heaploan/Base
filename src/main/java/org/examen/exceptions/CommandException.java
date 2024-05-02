package org.examen.exceptions;

import java.util.Arrays;
import java.util.List;

public class CommandException extends Exception {
    public static final int WRONG_OPERATION = 0;
    public static final int WRONG_NUM_ARGS = 1;
    public static final int KEY1_ALREADY_EXISTS = 2;
    public static final int KEY2_ALREADY_EXISTS = 3;
    public static final int WRONG_NUM_FORMAT = 4;
    public static final int WRONG_ENUM1 = 5;
    public static final int WRONG_ENUM2 = 6;

    private final List<String> messages = Arrays.asList(
            "Wrong operation",
            "Wrong number of arguments",
            "Key1 already exists",
            "Key2 already exists",
            "Wrong number format",
            "Wrong enum1",
            "Wrong enum2"
    );

    public final int code;

    public CommandException(int code){
        this.code = code;
    }
    private static final String ANSI_RED = "\033[31m";
    private static final String ANSI_RESET = "\033[0m";

    @Override
    public String getMessage(){
        if(code < 0 || code >= messages.size()){
            return "Unknown error";
        }
        return ANSI_RED + messages.get(code) + ANSI_RESET;
    }

}
