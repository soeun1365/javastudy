package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Board {

	//field
	private int bNo;
	private String title;
	private String writer;
	
	
	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writter=" + writer + "]";
	}

	//소스탭에서 만든 hashCode equals코드
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bNo != other.bNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
	
	
	/*직접작성한 hashCode와 equals
	@Override
	public int hashCode() {
		return title.length();
			//타이틀의 글자수가 같으면 같은보드일 가능성이있겠다.
		//return title.length() + writer.length();
			//타이틀 글자수 + 작성자 글자수의 합이 같으면 같은 보드일 가능성이 있겠다.
	}
		
	@Override
	public boolean equals(Object obj) {
			if(this == obj) {	//board1.equals(board1)
				return true;
			}if(obj instanceof Board) {
				Board board = (Board)obj;
				return this.bNo == board.bNo;	//게시글번호(bNo)가 같으면 같은 Board입니다.
			}
			return false;	//전달받은것이 board가 아닌경우 ex) board1.equals(member)
	}
	*/
	
}
/*
 	HashSet에 Board를 저장하고자 합니다.
 	동일한 Board의 경우 저장이 안되도록 설정해야 합니다.
 	
 	1. 자바의 기본 동작
 		1) 첫번째 Board의 해시코드를 확인합니다.(저장된 주소)
 		2) 같은 해시코드를 가지고 있는 Board가 있습니까?	no (Board는new로 생성되므로)
 		3) 따라서 같은 Board는 없다고 판단합니다.
 		4) 무조건 저장됩니다.

	2.	1) 같은 Board는 같은 해시코드를 가질 수 있도록 hashCode() 메소드를 오버라이드합니다.
	   		자바한테 맡기지 않는다.
	   	2) 같은 Board인지 비교할 수 있는 equals()메소드를 오버라이드합니다.
	   	3) 같은 해시코드를 가지고, equals() 결과가 true이면 동일한 Board가 있다고 판단하므로
	   		저장되지 않습니다.
 */

/*
 * 
 * Hash 기반의 컬렉션프레임워크(HashSet, HashMap등 )에
 * 저장할 객체들은
 * 모두 Generate hashsCode() and equals()를 추가해 줍니다.
 * [Source] = [Generate hashCode() and equals()]를 추가해 줍니다.
 * */
