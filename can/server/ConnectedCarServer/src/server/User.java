package server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Vector;


public class User extends Thread{
	//ChatServerView에서 넘겨받을 데이터
	Socket client;
	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	 
	OutputStream os;
	PrintWriter pw;
	
	String nickname ;
	StringTokenizer st;
	HashMap<String,User> userlist;
	HashMap<String,User> carlist;
	HashMap<String,User> checklist;
	String category;
	public User() {
		
	}
	public User(Socket client, HashMap<String,User> userlist,HashMap<String,User> carlist) {
		super();
		this.client = client;
		this.userlist = userlist;
		this.carlist = carlist;
		ioWork();
	}
	
	public void ioWork() { //처음 접속했을 때 한 번 실행되는 메소드
		try {
			is = client.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = client.getOutputStream();
			pw = new PrintWriter(os,true);
			
			nickname = br.readLine();
			System.out.println("id:"+nickname);
			//여기에 클라이언트의 소켓객체를 car인지 phone인지 구분해서 저장합니다.

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean check(String id,HashMap<String,User> list) {
		boolean result = false;
		if(list.get(id)!= null) {
			result = true;
		}
		System.out.println(result);
		return result;
	}
	 
	private void filteringMsg(String msg) {
		System.out.println("서버가 받은 클라이언트의 메시지:"+msg);
		st = new StringTokenizer(msg,"/");
		String protocol = st.nextToken();
		System.out.println(protocol);
		if(protocol.equals("job")) {
			//여기에서 클라이언트에게 메시지를 전달합니다.

		}
	}
	
	public void sendMsg(String message) {
		pw.println(message);
	}
	
	public void run() {
		while(true) {
			try {
				String msg = br.readLine();
				if(msg!=null) {
					filteringMsg(msg);
				}
			} catch (IOException e) {
				System.out.println("클라이언트가 접속을 끊음");
				try {
					//자원반납
					is.close();
					ir.close();
					br.close();
					os.close();
					pw.close();
					client.close();
					//
				} catch (IOException e1) {
				}
				break;
			}
		}
	}
	
}







