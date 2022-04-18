package hosptial.usersession.admin.membermanagement.memberboard;

import java.io.*;
import java.util.*;
import hosptial.DataPath;
import hosptial.signup.LogicCheck;
import hosptial.usersession.admin.forummanagement.forbidden.ForbiddenVO;

public class MemberDAO {
	Scanner sc = new Scanner(System.in);
	Stack<MemberVO> prev = new Stack<>(); // 이전 요소
	Stack<MemberVO> now = new Stack<>(); // 현재 출력요소
	Stack<MemberVO> next = new Stack<>(); // 다음 요소
	List<MemberVO> memberList = new ArrayList<>();
	int page = 5;

	public MemberDAO() {
		setMemberList();
	}

	private void setMemberList() {

		try (BufferedReader br = new BufferedReader(new FileReader(DataPath.userData));) {
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line == "")
					continue;
				String[] temp = line.split(",");
				MemberVO vo = new MemberVO();
				vo.setSequence(temp[0]);
				vo.setUserTypeCheck(temp[1]);
				vo.setId(temp[2]);
				vo.setPassword(temp[3]);
				vo.setName(temp[4]);
				vo.setPhoneNum(temp[5]);
				vo.setAddress(temp[6]);
				vo.setRegNo(temp[7]);
				if ("1".equals(temp[1]))
					doctorUser(temp[0], vo);
				memberList.add(vo);
			}

		} catch (Exception e) {
			System.out.println("데이터를 읽어오는 중 오류가 발생했습니다.");
			e.printStackTrace();
		}

		pageSet();

	}// setMemberList

	private void pageSet() {
		for (int i = memberList.size() - 1; i >= 0; i--) {
			next.push(memberList.get(i));
		}

		for (int i = 0; i < page; i++) {
			if (next.isEmpty())
				continue;
			now.push(next.pop());
		}
	}

	public void nextPage() {
		if (next.isEmpty()) {
			System.out.println("==========================================");
			System.out.println("\t마지막 페이지입니다.");
			System.out.println("잠시후 이전 메뉴로 돌아갑니다...");
			System.out.println("==========================================");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("forbiddenInsert Thread Error");
				e.printStackTrace();
			}
			return;
		}
		// 아래 for문 이해를 해라..
		for (int i = 0; i < page; i++) {
			if (now.isEmpty())
				continue;
			prev.push(now.pop());
		}
		for (int i = 0; i < page; i++) {
			if (next.isEmpty())
				continue; // continue 쓰는 이유가 stack안에 요소가 없을경우 pop을 하게되면, 안에 내용을 찾을수 없다는 에러문이 발생. 
							// 이걸 방지하기위해 사용
			now.push(next.pop());
		}

	}

	public void prevPage() {
		if (prev.isEmpty()) {
			System.out.println("==========================================");
			System.out.println("\t첫 페이지입니다.");
			System.out.println("잠시후 이전 메뉴로 돌아갑니다...");
			System.out.println("==========================================");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("forbiddenInsert Thread Error");
				e.printStackTrace();
			}
			return;
		}
		for (int i = 0; i < page; i++) {
			if (now.isEmpty())
				continue;
			next.push(now.pop());
		}
		for (int i = 0; i < page; i++) {
			if (prev.isEmpty())
				continue;
			now.push(prev.pop());
		}
	}

	private void doctorUser(String sequence, MemberVO vo) {
		try (BufferedReader br = new BufferedReader(new FileReader(DataPath.userDataDoctor));) {
			String loop = null;
			while ((loop = br.readLine()) != null) {
				if (loop == "")
					continue;
				String[] temp = loop.split(",");
				if (sequence.equals(temp[0])) {
					vo.setHospitalName(temp[1]);
					vo.setOperatingTimeWeekdays(temp[2]);
					vo.setOperatingTimeWeekends(temp[3]);
					vo.setOperatingTimeHolidats(temp[4]);
					vo.setLicenseNumber(temp[5]);
					vo.setDepartment(temp[6]);
				}
			} // while
		} catch (Exception e) {
			System.out.println("데이터를 읽어오는 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}// doctorUser

	public void getMemberList() {
		System.out.println("====================================================================");
		System.out.println("번호|\t아이디\t   |   회원이름   |   회원분류  |   생년월일 |    전화번호");
		System.out.println("====================================================================");
		if (memberList.isEmpty()) {
			System.out.println("\t가입된 회원이 없습니다.");
		} else {
			for (int i = 0; i < now.size(); i++) {
				if ("-1".equals(now.get(i).getUserTypeCheck())) {
					System.out.printf("%-3d|%-13s|%-11s|%-11s|%-11s|%-14s\n",
							memberList.indexOf(now.get(i)) + 1, "관리자", "unknown", "unknown",
							"unknown", "unknown");
				} else {
					System.out.printf("%-3d|%-15s|%-10s|%-10s|%-10s|%-15s\n",
							memberList.indexOf(now.get(i)) + 1, now.get(i).getId(),
							now.get(i).getName(),
							now.get(i).getUserTypeCheck().equals("0") ? "일반" : "의사",
							now.get(i).getRegNo().substring(0, 6), now.get(i).getPhoneNum());
				} // if
			} // for
		} // if
		System.out.println("====================================================================");
		System.out.println("0.종료, 1.이전목록, 2.다음목록, 3.상세보기, 4.계정정보 수정, 5.삭제");
		System.out.print("입력 : ");
	}

	public void memberDetail(int input) {
		if (memberList.isEmpty()) {
			System.out.println("\t가입된 회원이 없습니다.");
			return;
		}
		MemberVO vo = new MemberVO();
		vo = memberList.get(input - 1);
		System.out.println("===================================");
		System.out.println("\t회원 상세정보");
		System.out.println("===================================");
		if ("-1".equals(vo.getUserTypeCheck())) {
			System.out.println("관리자의 상세정보는 열람하실 수 없습니다.");
			System.out.println("계속 진행하시려면 아무키나 눌러주세요...");
			sc.nextLine();
			return;
		}

		System.out.printf("회원이름 : %s\n", vo.getName());
		System.out.printf("회원유형 : %s\n", vo.getUserTypeCheck().equals("0") ? "일반" : "의사");
		System.out.printf("아이디  : %s\n", vo.getId());
		System.out.printf("비밀번호 : %s\n", vo.getPassword());
		System.out.printf("전화번호 : %s\n", vo.getPhoneNum());
		System.out.printf("주민번호 : %s\n", vo.getRegNo());
		if ("0".equals(vo.getUserTypeCheck())) {
			System.out.printf("주소    : %s\n", vo.getAddress());
		} else {
			System.out.printf("병원주소 : %s\n", vo.getAddress());
			System.out.printf("병원이름 : %s\n", vo.getHospitalName());
			System.out.printf("면허번호 : %s\n", vo.getLicenseNumber());
			System.out.printf("병원부서 : %s\n", vo.getDepartment());
		} // if
		System.out.println();
		System.out.println("계속 진행하시려면 아무키나 눌러주세요...");
		sc.nextLine();
	}// memberDetail

	public void memberUpdate(int input) {
		if (memberList.isEmpty()) {
			System.out.println("\t가입된 회원이 없습니다.");
			return;
		}
		MemberVO vo = new MemberVO();
		vo = memberList.get(input - 1);
		LogicCheck check = new LogicCheck();

		if ("-1".equals(vo.getUserTypeCheck())) {
			System.out.println("관리자의 정보는 수정하실 수 없습니다.");
			System.out.println("계속 진행하시려면 아무키나 눌러주세요...");
			sc.nextLine();
			return;
		}

		while (true) {

			System.out.println("===================================");
			System.out.printf("\t회원 %s님의 계정정보 수정\n", vo.getName());
			System.out.println("===================================");
			System.out.println("0.뒤로가기");
			System.out.println("1.아이디 수정하기");
			System.out.println("2.비밀번호 수정하기");
			System.out.print("입력:");
			int select = Integer.parseInt(sc.nextLine());

			if (select == 0) {
				System.out.println("=================================");
				System.out.println("\t이전메뉴로 돌아갑니다.");
				System.out.println("=================================");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					System.out.println("MemberDAO Thread오류");
					e.printStackTrace();
				}
				return;
			} else if (select == 1) {

				System.out.println("아이디 수정(취소 : 0)");
				System.out.print("입력 :");
				String id = sc.nextLine();

				if ("0".equals(id)) {
					System.out.println("아이디 수정이 취소되었습니다.");
					continue;
				} else if (!check.idLogicCheck(id)) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("아이디는 5~16자리의 소문자와 숫자만 입력할 수 있습니다..");
					continue;
				} else {
					vo.setId(id);
					update();
				}

			} else if (select == 2) {

				System.out.println("비밀번호 수정(취소 : 0)");
				System.out.print("입력 :");
				String pw = sc.nextLine();

				if ("0".equals(pw)) {
					System.out.println("비밀번호 수정이 취소되었습니다.");
					continue;
				} else if (!check.pwLogicCheck(pw)) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("비밀번호 10~16자리의 영어 대소문자와 숫자만 입력할 수 있습니다.");
					continue;
				} else {
					vo.setPassword(pw);
					update();
				}
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} // while
	}// memberUpdate

	public void memberDelete(int input) {
		if (memberList.isEmpty()) {
			System.out.println("\t가입된 회원이 없습니다.");
			return;
		}
		MemberVO vo = new MemberVO();
		vo = memberList.get(input - 1);
		System.out.printf("%s번 사용자 %s님의 계정이 삭제되었습니다.\n", input, vo.getName());

		while (true) {
			System.out.println("1.저장, 2.취소");
			System.out.print("입력:");
			int result = Integer.parseInt(sc.nextLine());
			if (result == 1) {
				memberList.remove(memberList.indexOf(vo));
				System.out.println("삭제 되었습니다.");
				update();
				delete(vo.getSequence());
				return;
			} else if (result == 2) {
				System.out.println("취소 되었습니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}// memberDelete

	public void update() {
		try (Writer writer = new FileWriter(DataPath.userData);) {
			String[] data = new String[10000];
			for (int i = 0; i < memberList.size(); i++) {
				MemberVO vo = memberList.get(i);
				data[i] = vo.getSequence() + "," + vo.getUserTypeCheck() + "," + vo.getId() + ","
						+ vo.getPassword() + "," + vo.getName() + "," + vo.getPhoneNum() + ","
						+ vo.getAddress() + "," + vo.getRegNo();
				writer.write(data[i] + "\n");
			}
			System.out.println("데이터 저장완료");
		} catch (IOException e) {
			System.out.println("데이터 저장에 실패했습니다.");
			e.printStackTrace();
		}
	}

	// TODO 파일 여러개일수도 있으니 나중에 배열로 파일만들고 처리하기
	public void delete(String sequence) {
		try (BufferedReader br = new BufferedReader(new FileReader(DataPath.userDataDoctor));
				Writer bw = new FileWriter(DataPath.temp);) {

			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.equals(""))
					continue;
				String result = "";
				String[] temp = line.split(",");
				if (sequence.equals(temp[0]))
					continue;

				for (int i = 0; i < temp.length; i++) {
					if (i != 0)
						result += ",";
					result += temp[i];
				}
				bw.write(result + "\r\n");
			}

		} catch (Exception e) {
			System.out.println("데이터 삭제중 오류가 발생했습니다.");
			e.printStackTrace();
		}
		fileUpdate();
	}

	// TODO 이거도 파일 여러개일경우 추가해야함
	private void fileUpdate() {
		File oldFile = new File(DataPath.userDataDoctor);

		if (!oldFile.exists()) {
			System.out.println("파일 경로 에러");
			return;
		}
		File newFile = new File(DataPath.temp);
		oldFile.delete();
		newFile.renameTo(oldFile);
	}

}
