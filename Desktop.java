package Week3.Day1.org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop Size");
	}
	
	public static void main(String[] args) {
		Desktop dsktp=new Desktop();
		dsktp.computerModel();
		dsktp.desktopSize();
	}
}
