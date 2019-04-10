package clientside;
import java.net.*;
import java.io.*; 
public class lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			ServerSocket ss=new ServerSocket(3333);  
			Socket s=ss.accept();//establishes connection   
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();  
			System.out.println("message= "+str);  
			ss.close();  
			}catch(Exception e){System.out.println(e);} 

	}

}
