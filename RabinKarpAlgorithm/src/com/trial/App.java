package com.trial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
    public static void main(String[] args) throws IOException

    {    

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Rabin Karp Algorithm Test\n");

        System.out.println("\nEnter Text\n");

        String text = br.readLine();

        System.out.println("\nEnter Pattern\n");

        String pattern = br.readLine();

        System.out.println("\nResults : \n");

        RabinKarp rk = new RabinKarp(); 
        
        rk.search(pattern,text);

    }

}
