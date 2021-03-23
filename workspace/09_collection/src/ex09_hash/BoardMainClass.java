package ex09_hash;

import java.util.HashSet;
import java.util.Set;

public class BoardMainClass {

	public static void main(String[] args) {
		
		Board board1 = new Board(1000, "공지", "관리자");
		Board board2 = new Board(1000, "공지", "관리자");
		Board board3 = new Board(1000, "공지", "관리자");
		
		Set<Board> set = new HashSet<>();
		set.add(board1);
		set.add(board2);
		set.add(board3);
		
		System.out.println(set.toString());
		//분명같은 게시물 3개인데 중복을 막지못하고 세개가 나옴
		//자바한테 맡기면 안되겠다!
		
		
	}

}
