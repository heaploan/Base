package org.examen.view;

import org.examen.controller.Manager;
import org.examen.exceptions.CommandException;
import org.examen.model.Objeto1;
import org.examen.model.util.Validations;
import org.examen.view.messages.Message;

import java.util.HashMap;

public class Options {
    private String[] command;
    private Manager m = Manager.getInstance();
    private Validations vl = new Validations();
    private Message msg = new Message();

    public void setCommand(String[] command){
        this.command = command;
    }

    public void opcion1() throws CommandException{
        vl.valComLength(command,4);
        HashMap<String, Objeto1> objeto1 = m.getObjeto1Map();
        for (String key : objeto1.keySet()){
            Objeto1 objeto = objeto1.get(key);
            System.out.println(objeto.toString());
        }
        msg.getMessage(Message.MESSAGE1); //Mensaje de confirmación
    }

    public void opcion2() throws CommandException{
        vl.valComLength(command, 5);

        msg.getMessage(Message.MESSAGE2); //Mensaje de confirmación
    }
}
