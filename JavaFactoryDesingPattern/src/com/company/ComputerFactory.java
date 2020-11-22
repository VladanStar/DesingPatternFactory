package com.company;

public class ComputerFactory {

    private static ComputerFactory instance = null;

    private ComputerFactory() {
    }
    public static ComputerFactory getInstance(){
       if(instance == null){
           instance = new ComputerFactory();

       }
       return new ComputerFactory();
    }
    public Computer getComputer(String type, String ram, String hdd, String cpu){
        if(type.equalsIgnoreCase("PC")){
            return new PC(ram,hdd,cpu);
        }
        else if(type.equalsIgnoreCase("Server")){
            return  new Server(ram,hdd,cpu);
        }
        else {
            return null;
        }

    }
}
