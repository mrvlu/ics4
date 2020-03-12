import java.io.Serializable;

public class Tank implements Serializable{
 public int hp;  //not so good
 public String name;
 private int ammo; //better
 
 // Constructor of the class 
 // this is where default values are assigned
 public Tank(String givenName){
  name=givenName; 
  hp=50; 
  ammo=10;
  
 }
 
 public int getHP(){
  return hp;
 }
 
 public void chHP(int change){
  hp=hp+change;
 }
 
 
 public void shoot(Tank target){
  this.ammo=this.ammo-1;
  System.out.println(this.name+" has shot "+target.name); // usually bad practice
  target.chHP(-10);
  
 }
 
 public int getAmmo(){
  return ammo;
 }
 
 
 public String toString(){
   return "Name: "+name+" HP: "+hp;
 }
 
 
}
