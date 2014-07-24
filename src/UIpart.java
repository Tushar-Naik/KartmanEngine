import core.NLPEngine;
import core.StopWordRemover;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: tushar.naik
 * Date: 24/07/14
 * Time: 1:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class UIpart {
    public static void main(String[] args) throws IOException {
        NLPEngine nlpEngine = new NLPEngine();
        StopWordRemover stopWordRemover = new StopWordRemover();

        System.out.println("FLIPKART KARTMAN ENGINE");
        System.out.println("(commands to quit: q,quit,exit)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String consoleInput="";
        while(true) {

            System.out.print("OK KARTMAN, ");
            consoleInput=br.readLine();
            if(consoleInput.equals("q") || consoleInput.equals("quit") || consoleInput.equals("exit"))
                break;
            nlpEngine.processCommand(consoleInput);

        }
        System.out.println("THANK YOU. KARTMAN OUT.. PEACE");
    }
}
