
public class Test1 {


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test1 {

	public static void main(String[] args) {
		

		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		String formatedNow = now.format(formatter);
		System.out.println(formatedNow); // 2021/06/17
		
	}
}
