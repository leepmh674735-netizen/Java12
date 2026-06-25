package expection;

public class AutoCloseTest {
	public static void main(String[] args) {
		try (AutoCloseObj Obj  = new AutoCloseObj( )) {
		    throw new Exception( );
		} catch (Exception e) {
			System.out.println("예외 부분입니다");
		}
	}
}
