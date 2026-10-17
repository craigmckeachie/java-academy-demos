package com.pluralsight.workbook2a.stringbuilder;

public class PackingListStarter {

    public static void main(String[] args) {
        // BEFORE: a String can't change
        String trip = "Road Trip";
        trip.toUpperCase();
        System.out.println(trip);

        String list = "Packing list:";
        list = list + "\n- tent";
        list = list + "\n- snacks";
        System.out.println(list);

        // TODO: AFTER -- build a packing list with a StringBuilder
    }
}
