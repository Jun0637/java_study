package global.master43.fitness.service;
import java.util.Scanner;

import global.master43.fitness.vo.GymVO;

public class GymService {
	Scanner keyin = new Scanner(System.in);
	GymVO vo;

	// 생성자
	public GymService() {
		String choice;
		while (true) {
			menu();
			choice = keyin.next();

			switch (choice) {
			case "1":
				join();
				break;
			case "2":
				update();
				break;
			case "3":
				delete();
				break;
			case "4":
				retrieve();
				break;
			case "0":
				System.out.println("*프로그램을 종료합니다.*");
				return;
			default:
				System.out.println("다시 선택해주세요.");
			}

		}
	}
	public void menu() {
		System.out.println("=========[1인 피티니스 클럽]=========");
		System.out.println("	    1. 가 입");
		System.out.println("	    2. 수 정");
		System.out.println("	    3. 탈 퇴");
		System.out.println("	    4. 조 회");
		System.out.println("	    0.  끝");
		System.out.println("================================");
		System.out.println("	    > 선택 : ");
	}
	private void update() {
		System.out.println("[수정]");
		double height, weight;
		String answer;
		
		if(vo == null) {
			System.out.println("수정할수 없습니다.");
			return;
		}
		System.out.print("> 키(cm) :");
		height = keyin.nextDouble();
		System.out.print("> 몸묵게(kg) :");
		weight = keyin.nextDouble();
		
		System.out.println(">수정하시겠습니까?(y/n) : ");
		answer = keyin.next();
		if(!(answer.equals("Y")||answer.equals("y"))) {
			System.out.println("작업이 취소되었습니다.");
			return;
		}
		vo.setHeight(height);
		vo.setWeight(weight);
		System.out.println("**수정이 완료되었습니다.");
		}

	// 회원가입
	private void join() {
		System.out.println("[회원가입]");
		if (vo != null) {
			System.out.println("**가입을 할 수 없습니다.");
			return;
		}
		int id;
		String name;
		double height, weight;
		
		System.out.print("아이디를 입력하세요 : ");
		id = keyin.nextInt();
		System.out.print("이름을 입력하세요");
		name = keyin.next();
		System.out.print("키");
		height = keyin.nextDouble();
		System.out.print("몸구게");
		weight = keyin.nextDouble();
		
		vo = new GymVO(id, name, height, weight);
		
	}
	private void retrieve() {
		System.out.println("[조회]");
		if (vo == null) {
			System.out.println("조회할수 없습니다");
			return;
		}
		vo.output();
	}
	private void delete() {
		System.out.println("[탈퇴]");
		String answer;
		if(vo == null) {
			System.out.println("탈퇴할수 업습니다.");
			return;
	}
		System.out.println(">탈퇴하시겠습니까?(y/n) :");
		answer =  keyin.next();
		if ( !(answer.equals("y") || answer.equals("Y"))) {
			System.out.println("**작업이 취소되었습니다.");
			return;
		}
		
		
		vo = null;
		System.out.println("탈퇴 완료되었습니다.");

		int id;
		String name;
		double height, weight;

		System.out.print("> 아이디 :");
		id = keyin.nextInt();
		System.out.print("> 이 름 :");
		name = keyin.next();
		System.out.print("> 키(cm) :");
		height = keyin.nextDouble();
		System.out.print("> 몸묵게(kg) :");
		weight = keyin.nextDouble();

		vo = new GymVO(id, name, height, weight);
		System.out.println("*회원 가입이 완료되었습니다.*");
		return;

	}
}