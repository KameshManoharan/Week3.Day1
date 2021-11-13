package Week3.Day1;

public class SmartPhone extends AndroidPhone{
	
	public void takeVideo() {
		System.out.println("Take Video from SmartPhone");
	}
	
	public void connectWhatsApp() {
		System.out.println("Connect WhatsApp");
	}

	public static void main() {
		SmartPhone smp=new SmartPhone();
		smp.takeVideo();
		smp.connectWhatsApp();
		System.out.println(smp);
	}
}
