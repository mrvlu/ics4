
/** 
 *  testTanks. Used to actually play a game. 
 * 
 *
 **/
package WithoutGraphics;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

 /**
  * @param args
 * @throws IOException 
  */
 public static void main(String[] args) throws IOException {
  // TODO Auto-generated method stub
  Tank hero=new Tank("Jim"); // Tank object #1 with the name Jim
  Tank villain=new Tank("Baddie"); // Tank object #2 with the name Baddie
  
  
  System.out.println("Let the battle begin: ");
  System.out.println(hero); // using the methods of each object created
  System.out.println(villain); // using the methods of each object created
  System.out.println(villain.hp);  // yes you can access the variables in each object created but this 
           // considered bad practice because it's access is almost unrestricted
  hero.shoot(villain);
  
  System.out.println("---Results---");
  System.out.println(hero);
  System.out.println(villain);  

  
  villain.shoot(hero);
  System.out.println(hero);
  System.out.println("We are now going to save your progress: ");
  
  FileOutputStream fout = new FileOutputStream("save.ser");
  ObjectOutputStream oos = new ObjectOutputStream(fout);
  oos.writeObject(hero);
  oos.close();
  
  
  
  
  
  
  

 }

}
