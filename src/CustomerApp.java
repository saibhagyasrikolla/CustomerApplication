import java.io.IOException;

public class CustomerApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		CustomerServices cs = new CustomerServices();
		cs.menu();
	}
}
