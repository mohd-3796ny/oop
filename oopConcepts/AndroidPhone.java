package oopConcepts;

public class AndroidPhone extends CellPhone implements TeleCommunication {

	@Override
	public void text() {
		System.out.println("AndroidPhone...text");
		
		
	}

	@Override
	public void call() {
		System.out.println("AndroidPhone...call");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("AndroidPhone...receive call");
	}

	@Override
	public void fax() {
		System.out.println("AndroidPhone...fax");
		
	} 

public void vedioCall() {
	System.out.println("AndroidPhone...vedio call");
}
}







