package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	//field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	

	//method
	public void menu() {
		System.out.println("======사원관리프로그램=======");
		System.out.println("1. 사원등록");
		System.out.println("2. 정보수정");
		System.out.println("3. 퇴사처리");
		System.out.println("4. 사원검색");
		System.out.println("5. 전체조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("=============================");
	}
	public void execute() {
		while(true) {
			menu();
			System.out.print("선택(1 ~ 6)>>> ");
			switch (sc.nextInt()) {
			case 1 : insertStaff(); break;
			case 2 : updateStaff(); break;
			case 3 : deleteStaff(); break;
			case 4 : selectOne(); break;
			case 5 : selectList(); break;
			case 6 : System.out.println("프로그램을 종료합니다."); 		
					 return;
			default : System.out.println("다시 선택하세요.");
			}
		}
	}
	public void insertStaff() {
		
		StaffDto staffDto = new StaffDto();
		
		System.out.print("신규 사원 이름 >>> ");
		String name = sc.next();
		staffDto.setName(name);
		
		System.out.print("신규 부서명 >>> ");
		String department = sc.next();
		staffDto.setDepartment(department);
		
		int no = dao.selectMaxNo();	//가장 최근에 등록된 번호 알아내기
		staffDto.setNo(no + 1);	//최근번호에 1더해서 저장하기

		int result = dao.insertStaff(staffDto);
		System.out.println(result + "명의 사원이 추가되었습니다.");
		
	}
	
	public void updateStaff() {
		
		System.out.print("수정할 사원 번호 입력>>> ");
		int no = sc.nextInt();
		
		StaffDto staffDto = dao.selectOneByNo(no);
		
		System.out.println("수정할 내용을 선택하세요(1. 이름, 2. 부서)");
		
		int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("새로운 사원의 이름 입력>>> ");
				String name = sc.next();
				staffDto.setName(name);
			}else if(choice == 2) {
				System.out.print("새로운 부서 입력>>> ");
				String department = sc.next();
				staffDto.setDepartment(department);
			}else {
				System.out.println("잘못된 선택입니다. 수정이 취소됩니다.");
				return;
		}
			int result = dao.updateStaff(staffDto);
			System.out.println(result + "명의 회원정보가 수정 되었습니다.");
	}
	
	public void deleteStaff() {
		System.out.print("삭제할 사원 번호 입력>>> ");
		int no = sc.nextInt();
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		int result = dao.deleteStaff(staffDto);
		System.out.println(no + "회원정보가 삭제되었습니다.");
	}
	
	public void selectOne() {
		System.out.print("조회할 사원 번호 입력>>> ");
		int no = sc.nextInt();
		StaffDto staffDto = dao.selectOneByNo(no);	//널이 올수도있음
		if(staffDto == null) {
			System.out.println("사원번호 " + no + " 를가진 사원이 없습니다.");
		}else {
			System.out.println(staffDto);
		}
	}
	
	public void selectList() {
		List<StaffDto> staffList = dao.selectList();
		System.out.println("총 사원수: " + staffList.size() + "명");
		for(StaffDto staffDto : staffList) {
			System.out.println(staffDto);
		}
	}
}
