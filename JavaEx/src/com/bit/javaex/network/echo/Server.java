package com.bit.javaex.network.echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// 절차
		//	1. 서버 소켓 생성
		ServerSocket serverSocket = null; // 연결용, 데이터용이 아님
		
		try {
			serverSocket = new ServerSocket();
			//	2. 바인드 작업: IP, Port를 서버 소켓에 연결
			InetSocketAddress local = 
					new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local);
			
			System.out.println("<서버 시작>");
			System.out.println("[연결 대기중입니다.]");
			//	3. 연결 대기
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//	서버 소켓 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
