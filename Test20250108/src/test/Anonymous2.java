package test;

public class Anonymous2 {

	remoteControl field = new remoteControl(){

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
			
		}
	
	};
	
	public void method1() {
		remoteControl localVar = new remoteControl () {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다");
				
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	public void method2(remoteControl remote) {
		remote.turnOn();
		remote.turnOff();
	}
}
