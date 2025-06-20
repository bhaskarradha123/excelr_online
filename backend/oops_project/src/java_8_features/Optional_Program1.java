package java_8_features;

import java.util.Optional;

public class Optional_Program1 {

	public static void main(String[] args) {
		Optional<String> fatherName = getUserFatherName();
		String name=fatherName.orElse("father not found to display");
//		String name = fatherName.orElseThrow(
//		() -> new RuntimeException("father name not found"));
		System.out.println(name);
	}

	public static Optional<String> getUserFatherName() {
		String name = null;
		return Optional.ofNullable(name);
	}
}
