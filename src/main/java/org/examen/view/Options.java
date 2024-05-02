package org.examen.view;

import org.examen.controller.Manager;
import org.examen.exceptions.CommandException;
import org.examen.model.util.Validations;

public class Options {
    private String[] command;
    private Manager m = Manager.getInstance();
    private Validations vl = new Validations();


    public void setCommand(String[] command){
        this.command = command;
    }

    public void opcion1() throws CommandException{

    }

    public void opcion2() throws CommandException{

    }
}
