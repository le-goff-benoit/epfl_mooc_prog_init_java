import java.util.Arrays;

public class HelloWorld {
	public static void main(String args[]) {
		String[] mots = new String[] { "hello", "world", "!" };
		Arrays.stream(mots).forEach(mot -> {
			System.out.print(mot + " ");
		});
	}
}