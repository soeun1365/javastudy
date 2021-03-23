package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {

		//field
		private String name;	//도서관이름
		private List<Book> books = new ArrayList<>(); 
		
		//constructor
		public Library(String name) {
			this.name = name;
		}

		//method
		public void booksinfo() {
			System.out.println("도서관 이름: " + name);
			for(Book book : books) {
				System.out.println(book);	//toString메소드를 만들어뒀으니 알아서 나올것임
			}
		}
		
		public void addBook(Book book) {
			books.add(book);	//크기가 저장되어있지도 않음 그냥 넣음
		}
		
		public void removeBook(int bNo) {
			for(Book book : books) {
				if(book.getBNo() ==bNo) {
					books.remove(book);
					break;	//지웠으면 break
				}
			}
			
			/*
			int removeIdx =-1;
			for(int i =0, length = books.size() ; i <length ; i++) {
				if(books.get(i).getBNo() == bNo) {
					removeIdx = i;
					break;
				}
			}if(removeIdx ==-1) {	//지우려는게 없는것임
				System.out.println(bNo + "번 Book이 없습니다.");
			}else {
				books.remove(removeIdx);
				System.out.println(bNo + "번 Book이 삭제되었습니다.");
			}
			*/
		}
		

}
