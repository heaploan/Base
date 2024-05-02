package org.examen.controller;

import org.examen.model.Objeto1;
import org.examen.model.Objeto2;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private static Manager instance;
    private HashMap<String, Objeto1> objeto1Map;
    private HashMap<String, Objeto2> objeto2Map;

    private Manager(){
        this.objeto1Map = new HashMap<>();
        this.objeto2Map = new HashMap<>();
    }
    public static Manager getInstance(){
        if(instance == null){
            instance = new Manager();
        }
        return instance;
    }

    public HashMap<String, Objeto1> getObjeto1Map() {
        return objeto1Map;
    }

    public HashMap<String, Objeto2> getObjeto2Map() {
        return objeto2Map;
    }
}
