package de.hsos.prog3.team5.ab01;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
	// write your code here
        Set<Nachbar> nachbarVW = new HashSet<>();

        Nachbar n1 = new Nachbar("Kathi", "Schmidt");

        Nachbar n2= new Nachbar("Wolfgang", "Petri");

        Nachbar n3 = new Nachbar("Paul", "Washck");

        nachbarVW.add(n1);
        nachbarVW.add(n2);
        nachbarVW.add(n3);

        for (Nachbar obj: nachbarVW) {
            System.out.println("Henlo " + obj + "!");
        }

    }
}
