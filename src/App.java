
public class App {

	public static void main(String[] args) {
		// StringBuilder
		StringBuilder s = new StringBuilder();
		
		s.append("Here we go ")
		.append("Let's go crazy")
		.append("!!!");
		
		s.append("...");
		
		
		System.out.printf("An integer: %d %f %s\n", 5, 7.3, s);		
		
		// StringBuffer (useful in multi-threading)
		StringBuffer sb = new StringBuffer();
		
		sb.append("Here we go ")
		.append("Let's go crazy")
		.append("!!!");
		
		sb.append("...");
				
		System.out.printf("An integer: %d %f %s\n", 5, 7.3, sb);
		
		//Formatting output, left justified
		for (int i= 0; i<15; i++) {
			System.out.printf("Number: %-5.1f\n", i*1.0);
		}		//Formatting output, left justified
		
		// Formatting output, right justified
		for (int i= 0; i<15; i++) {
			System.out.printf("Number: %3d\n", i);
		}

	}

}
