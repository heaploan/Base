package org.examen.model.util;

import org.examen.exceptions.CommandException;
import org.examen.model.enums.Enum1;
import org.examen.model.enums.Enum2;

import java.util.Locale;

public class Validations {
    public void valComLength(String[] command, int expectedLength) throws CommandException{
        if(command.length != expectedLength){
            throw new CommandException(CommandException.WRONG_NUM_ARGS);
        }
    }

    public void valComLength(String[] commandParts, int min, int max) throws CommandException{
        if(commandParts.length < min || commandParts.length > max ) {
            throw new CommandException(CommandException.WRONG_NUM_ARGS);
        }
    }

    public int valIntNum(String num) throws CommandException {
        try{
            return Integer.parseInt(num);
            //int numInt = Integer.parseInt(num);
            //if(numInt < 0 || numInt > 200){ // el || es en caso de que pida un máximo también.
            //} en caso de necesitar un mínimo
            //return numInt;
        } catch (NumberFormatException e){
            throw new CommandException(CommandException.WRONG_NUM_FORMAT);
        }
    }

    public float valFloatnum(String num) throws CommandException {
      try {
          return Float.parseFloat(num);
      } catch (NumberFormatException e){
          throw new CommandException(CommandException.WRONG_NUM_FORMAT);
      }
    }

    public Enum1 valEnum1(String enum1) throws CommandException {
        try{
            return Enum1.valueOf(enum1.toUpperCase());
        } catch (IllegalArgumentException e){
            throw new CommandException(CommandException.WRONG_ENUM1);
        }
    }

    public Enum2 valEnum2(String enum2) throws CommandException {
        try{
            return Enum2.valueOf(enum2.toUpperCase());
        } catch (IllegalArgumentException e){
            throw new CommandException(CommandException.WRONG_ENUM2);
        }
    }

}
