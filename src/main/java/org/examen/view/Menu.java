package org.examen.view;

import org.examen.exceptions.CommandException;

public class Menu {
    InputData input = new InputData();
    Options op = new Options();

    public void menu(){
        String option;
        do{
            String[] command = input.askStr().trim().split(" ");
            op.setCommand(command);
            option = command[0].toLowerCase();
            try{
                switch(option){
                    case "opcion1":
                        break;
                    case "opcion2":
                        break;
                    case "opcion3":
                        break;
                    case "opcion4":
                        break;
                    case "opcion5":
                        break;
                    case "opcion6":
                        break;
                    case "opcion7":
                        break;
                    case "opcion8":
                        break;
                    case "opcion9":
                        break;
                    case "exit"://no te olvides de cambiarlo por lo que ponga en el examen.
                        System.out.println("Saliendo...");
                        break;
                    default:
                        throw new CommandException(CommandException.WRONG_OPERATION);
                }
            } catch (CommandException e){
                System.out.println(e.getMessage());
            }
        } while(!option.equals("exit")); //también cambia esto por lo que ponga en el examen.
    }
}

