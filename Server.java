package dailywork08;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Server {
	public static HashMap<String, PrintWriter> users= new HashMap<String,PrintWriter>();
	public static void main(String[] args) throws Exception{//一对多的聊天
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(8088);
		while(true){
			System.out.println("正在等待");
			Socket socket = server.accept();
			SocketHandler handler = new SocketHandler(socket);
			Thread thread = new Thread(handler);
			thread.start();
		}
	}
}

