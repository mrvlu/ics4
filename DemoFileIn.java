/**
 * File Read
 * VLu
 * Oct 24th, 2011
 * Demo of how to read a single line of text from the file using BufferedReader
 */


import java.io.*;
import java.util.Scanner;
import java.net.*;  //handles the network protocols

public class DemoFileIn {

 /**
  * @param args
  */
 public static void main(String[] args) throws IOException {

  // reading from a file
  BufferedReader infile = new BufferedReader (new FileReader("ICS4U101.txt"));
  
  // reading from a URL
  //String website="http://download.finance.yahoo.com/d/quotes.csv?s=AAPL&f=sl1d1t1c1ohgv&e=.csv";
   
  //BufferedReader infile = new BufferedReader (new InputStreamReader((new URL(website).openConnection()).getInputStream()));

  String line;
  System.out.println("Beginning to read the file now:");
  line=infile.readLine();   // Scanner uses input.nextLine(); Files use readLine() because you read it 

  while ( line!=null){ //check that the line is not at the end before trying to read the next line.
   System.out.println(line.toUpperCase()+"!");
   //String data[]=line.split(",");
   //Store contents of the file into memory as an ARRAY
   //for (int i=0;i<data.length;i++){
   //  System.out.println("Element #"+i+" "+data[i]);
   //}
   line=infile.readLine(); // get me the next line now 

   
  }



  System.out.println("Done reading the file... must close as a good habit.");
  infile.close();




 }

}
