import java.io.*;
import java.net.*;

class Client11 extends Thread{
    public void run()
{ 
        String sentence;
        String modifiedSentence;
      while(true){
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("myname.domain.com", 2343);

 DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.println("Ready");
        sentence = in.readLine();
        out.writeBytes(sentence + '\n');
        modifiedSentence = in.readLine();
        System.out.println(modifiedSentence);

      clientSocket.close();
	  }
}
public static void main(String args[]) throws Exception {
Client11 c1=new Client11 ();
c1.start();
}
}