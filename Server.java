import java.lang.*;
import java.io.*;
import java.net.*;

class Server {
   public static void main(String args[]) {
      String data = "Toobie ornaught toobie";
	  String message;
      try {
    	  //Detecting the localhost's ip address
    	  InetAddress localaddr = InetAddress.getLocalHost();
    	  System.out.println ("Local hostnameIP: " + localaddr );
    	  System.out.println ("Local IP Address : " + localaddr.getHostAddress());
		 // Creating a server socket for connection
         ServerSocket srvr = new ServerSocket(1234);
		 System.out.println("Waiting for connection on "+localaddr);
		 // Accept incoming connection
		 Socket skt = srvr.accept();
         System.out.print("Server has connected!\n");
         // get Input and Output streams
		 PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
		 out.flush();
		 BufferedReader in = new BufferedReader(new
            InputStreamReader(skt.getInputStream()));
         System.out.print("Sending string: '" + data + "'\n");
		 out.println(data);
		 do {

				message=in.readLine();
				System.out.println("client>"+message);
				if (message.equals("password")){
					out.println("Access Granted");
				}else if (message.equals("bye")){
					out.println("Server closing");
					System.out.println("server>Server closing");
				}
		}while(!message.equals("bye"));
         out.close();
         skt.close();
         srvr.close();
      }catch(BindException e){
  		//e.printStackTrace();
        System.out.print("A server is already running on the same port.");    	  
      }catch(SocketException e) {
		//e.printStackTrace();
        System.out.print("Client has disconnected rudely.");
      }catch(Exception e){
    	  //e.printStackTrace();
          System.out.print(":( Whoops! It didn't work!\n");

      }
   }
   
   

}
