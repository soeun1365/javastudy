package ex02_byte;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamMainClass {

	public static void main(String[] args) {
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("board.dat")); //보드를 통때로
			//1.개별저장
			Board board = new Board("공지", "잘읽어라", "관리자");
			oos.writeObject(board);	//board객체는 반드시 "직렬화" 되어있어야한다.
			
			//2.ArrayList저장
			List<Board> boardList = new ArrayList<Board>();
			boardList.add(new Board("필독", "꼭읽어라", "관리자"));
			boardList.add(new Board("협조", "부탁한다", "관리자"));
			oos.writeObject(boardList);//board객체는 반드시 "직렬화" 되어있어야한다.
			
			System.out.println("board.dat 파일이 생성되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) {oos.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}