import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;
class Client {
	public static void main(String args[]) {
		try {
			Socket skt = new Socket("localhost", 1234); // change localhost to server ip address if not loopback
			BufferedReader in = new BufferedReader(new
					InputStreamReader(skt.getInputStream()));
			Scanner kbReader = new Scanner(System.in);
			PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
			out.flush();
			String message, servermessage;

			System.out.println("Preparing to chat...");
			out.println("I am now connected to you.");
			do{
				if (in.ready()){
					servermessage=in.readLine();
					
					System.out.println("server>: "+servermessage);
				}

				message=kbReader.nextLine();
				out.println(message);



//				out.println("ok");

				//message="bye";
				//out.println("bye");
				Thread.currentThread().sleep(300); //give time for server to respond
			}while (!message.equals("bye"));


			out.close();
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.print("Whoops! It didn't work!\n");
		}
	}
}
