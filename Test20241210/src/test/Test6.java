package test;

import java.io.IOException;

public class Test6 {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례대로 할당");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		Scheduler sch = null;
		
		if (ch == 'R' || ch == 'r') {
			sch = new RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			sch = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			sch = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다");
			return;
		}
		sch.getNextCall();
		sch.sendCallToAgent();
		
		
		// p322
		// 인터페이스 Scheduler
		// 추상 메서드 getNextCall(), sendCallToAgent()
		
		// 상속받는 클래스 RoudnRobin, LeastJob, PriorityAllocation
		// 오버라이딩 메서드 "상담 전화를 순서대로 대기열에서 가져옵니다"
		// "현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다"
		//

	}

}
