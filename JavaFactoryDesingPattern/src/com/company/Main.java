package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer pc = ComputerFactory.getInstance().getComputer("pc","4GB","500GB","4.6GHz");
        Computer server = ComputerFactory.getInstance().getComputer("server","16Gb","700GB","5.1");
        PC pc1 = (PC) ComputerFactory.getInstance().getComputer("pc","4.4GB","600GB","4.2GHz");

        System.out.println("PC" +pc);
        System.out.println("Server" + server);
    }
}
