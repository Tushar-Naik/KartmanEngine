package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: tushar.naik
 * Date: 24/07/14
 * Time: 12:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class UIFeeder {

    public static void main(String args[]) throws IOException {

        NLPEngine nlpEngine = new NLPEngine();
        StopWordRemover stopWordRemover = new StopWordRemover();

        System.out.println("FLIPKART KARTMAN ENGINE");
        System.out.println("(commands to quit: q,quit,exit)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String consoleInput="";
        do {
            System.out.print("OK KARTMAN, ");
            consoleInput=br.readLine();
            nlpEngine.processCommand(consoleInput);

        }while(consoleInput!="q" && consoleInput!="quit" && consoleInput!="exit");
        System.out.println("THANK YOU. KARTMAN OUT.. PEACE");
    }
}
