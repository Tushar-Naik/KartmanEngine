package core;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: tushar.naik
 * Date: 24/07/14
 * Time: 12:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class NLPEngine {
    String previousCommand;
    String command;
    List<String> associatedKeywords =new ArrayList<String>();
    List<String> tokens = new ArrayList<String>();
    StopWordRemover stopWordRemover = new StopWordRemover();
    StringTokenizer stringTokenizer;
    public NLPEngine()
    {
        command="";
        previousCommand="";
    }

    public void processCommand(String consoleInput) {

        command=consoleInput;
        stringTokenizer=new StringTokenizer(consoleInput,",. ");
        while(stringTokenizer.hasMoreTokens())
        {
            tokens.add(stringTokenizer.nextToken());
        }
        System.out.println("Tokenized form: "+tokens);
        System.out.println("ok?");


        // lowercase it
        // spell correction if required
        // remove duplicates
        // remove stop words
        // realize keywords
        // check if applicable
        // perform action (search, select, buy etc etc)
        // retrieve results.

    }
}
