package me.thelpro.math;

import me.thelpro.math.party.Party;
import me.thelpro.math.party.PrintMap;
import org.apache.commons.collections.MapUtils;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n" +
                "░░░░░██╗██████╗░██████╗░\n" +
                "░░░░░██║██╔══██╗██╔══██╗\n" +
                "░░░░░██║██████╔╝██████╔╝\n" +
                "██╗░░██║██╔═══╝░██╔═══╝░\n" +
                "╚█████╔╝██║░░░░░██║░░░░░\n" +
                "░╚════╝░╚═╝░░░░░╚═╝░░░░░");
        System.out.println("" +
                "░░█ ▄▀█ █░█ ▄▀█   █▀█ ▄▀█ █▀█ ▀█▀ █▄█   █▀█ █░░ ▄▀█ █▄░█ █▄░█ █▀▀ █▀█\n" +
                "█▄█ █▀█ ▀▄▀ █▀█   █▀▀ █▀█ █▀▄ ░█░ ░█░   █▀▀ █▄▄ █▀█ █░▀█ █░▀█ ██▄ █▀▄");
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nWelcome to the Java party planner.\nPlease enter the amount of adults coming.");
        int a = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the amount of children coming.");
        int c = scan1.nextInt();
        TimeUnit.MILLISECONDS.sleep(1000);
        for(int clear = 0; clear < 1000; clear++) System.out.println("\b");
        System.out.println("\n" +
                "██╗░░░░░░█████╗░░█████╗░██████╗░██╗███╗░░██╗░██████╗░░░░\n" +
                "██║░░░░░██╔══██╗██╔══██╗██╔══██╗██║████╗░██║██╔════╝░░░░\n" +
                "██║░░░░░██║░░██║███████║██║░░██║██║██╔██╗██║██║░░██╗░░░░\n" +
                "██║░░░░░██║░░██║██╔══██║██║░░██║██║██║╚████║██║░░╚██╗░░░\n" +
                "███████╗╚█████╔╝██║░░██║██████╔╝██║██║░╚███║╚██████╔╝██╗\n" +
                "╚══════╝░╚════╝░╚═╝░░╚═╝╚═════╝░╚═╝╚═╝░░╚══╝░╚═════╝░╚═╝");
        TimeUnit.MILLISECONDS.sleep(1000);
        for(int clear = 0; clear < 1000; clear++) System.out.println("\b");
        System.out.println("\n" +
                "██╗░░░░░░█████╗░░█████╗░██████╗░██╗███╗░░██╗░██████╗░░░░░░░\n" +
                "██║░░░░░██╔══██╗██╔══██╗██╔══██╗██║████╗░██║██╔════╝░░░░░░░\n" +
                "██║░░░░░██║░░██║███████║██║░░██║██║██╔██╗██║██║░░██╗░░░░░░░\n" +
                "██║░░░░░██║░░██║██╔══██║██║░░██║██║██║╚████║██║░░╚██╗░░░░░░\n" +
                "███████╗╚█████╔╝██║░░██║██████╔╝██║██║░╚███║╚██████╔╝██╗██╗\n" +
                "╚══════╝░╚════╝░╚═╝░░╚═╝╚═════╝░╚═╝╚═╝░░╚══╝░╚═════╝░╚═╝╚═╝");
        TimeUnit.MILLISECONDS.sleep(1000);
        for(int clear = 0; clear < 1000; clear++) System.out.println("\b");
        System.out.println("\n" +
                "██╗░░░░░░█████╗░░█████╗░██████╗░██╗███╗░░██╗░██████╗░░░░░░░░░░\n" +
                "██║░░░░░██╔══██╗██╔══██╗██╔══██╗██║████╗░██║██╔════╝░░░░░░░░░░\n" +
                "██║░░░░░██║░░██║███████║██║░░██║██║██╔██╗██║██║░░██╗░░░░░░░░░░\n" +
                "██║░░░░░██║░░██║██╔══██║██║░░██║██║██║╚████║██║░░╚██╗░░░░░░░░░\n" +
                "███████╗╚█████╔╝██║░░██║██████╔╝██║██║░╚███║╚██████╔╝██╗██╗██╗\n" +
                "╚══════╝░╚════╝░╚═╝░░╚═╝╚═════╝░╚═╝╚═╝░░╚══╝░╚═════╝░╚═╝╚═╝╚═╝");
        TimeUnit.MILLISECONDS.sleep(1000);
        for(int clear = 0; clear < 1000; clear++) System.out.println("\b");
        System.out.println("\n" +
                "██╗░░░░░░█████╗░░█████╗░██████╗░██╗███╗░░██╗░██████╗░░░░░░░░░░░░░\n" +
                "██║░░░░░██╔══██╗██╔══██╗██╔══██╗██║████╗░██║██╔════╝░░░░░░░░░░░░░\n" +
                "██║░░░░░██║░░██║███████║██║░░██║██║██╔██╗██║██║░░██╗░░░░░░░░░░░░░\n" +
                "██║░░░░░██║░░██║██╔══██║██║░░██║██║██║╚████║██║░░╚██╗░░░░░░░░░░░░\n" +
                "███████╗╚█████╔╝██║░░██║██████╔╝██║██║░╚███║╚██████╔╝██╗██╗██╗██╗\n" +
                "╚══════╝░╚════╝░╚═╝░░╚═╝╚═════╝░╚═╝╚═╝░░╚══╝░╚═════╝░╚═╝╚═╝╚═╝╚═╝");
        TimeUnit.MILLISECONDS.sleep(1000);
        for(int clear = 0; clear < 1000; clear++) System.out.println("\b");
        System.out.println("\n" +
                "██╗░░░░░░█████╗░░█████╗░██████╗░██╗███╗░░██╗░██████╗░░░░░░░░░░░░░░░░\n" +
                "██║░░░░░██╔══██╗██╔══██╗██╔══██╗██║████╗░██║██╔════╝░░░░░░░░░░░░░░░░\n" +
                "██║░░░░░██║░░██║███████║██║░░██║██║██╔██╗██║██║░░██╗░░░░░░░░░░░░░░░░\n" +
                "██║░░░░░██║░░██║██╔══██║██║░░██║██║██║╚████║██║░░╚██╗░░░░░░░░░░░░░░░\n" +
                "███████╗╚█████╔╝██║░░██║██████╔╝██║██║░╚███║╚██████╔╝██╗██╗██╗██╗██╗\n" +
                "╚══════╝░╚════╝░╚═╝░░╚═╝╚═════╝░╚═╝╚═╝░░╚══╝░╚═════╝░╚═╝╚═╝╚═╝╚═╝╚═╝");
        for(int clear = 0; clear < 1000; clear++) System.out.println("\b");
        Party party = new Party(a, c);
        System.out.println("You will need these items for the party: ");
        PrintMap.printMap(party.getAllItems());
        for(int clear = 0; clear < 4; clear++) System.out.println("\b");

    }
}