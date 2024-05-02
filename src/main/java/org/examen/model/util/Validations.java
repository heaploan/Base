package org.examen.model.util;

import org.examen.controller.Manager;
import org.examen.exceptions.CommandException;
import org.examen.model.Objeto1;
import org.examen.model.Objeto2;
import org.examen.model.enums.Enum1;
import org.examen.model.enums.Enum2;

import java.util.HashMap;
import java.util.Map;

public class Validations {
    private Manager manager = Manager.getInstance();

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

    public void valObjeto1Exists(String command) throws CommandException {
        HashMap<String,Objeto1> objetos = manager.getObjeto1Map();
        if(objetos.containsKey(command)){
            throw new CommandException(CommandException.KEY1_ALREADY_EXISTS);
        }
    }

    public void valObjeto1NotExists(String command) throws CommandException {
        HashMap<String,Objeto1> objetos = manager.getObjeto1Map();
        if(!objetos.containsKey(command)){
            throw new CommandException(CommandException.OBJECT1_DOES_NOT_EXISTS);
        }
    }

    public void valObjeto2Exists(String command) throws CommandException {
        HashMap<String, Objeto2> objetos = manager.getObjeto2Map();
        if(objetos.containsKey(command)){
            throw new CommandException(CommandException.KEY2_ALREADY_EXISTS);
        }
    }
}
