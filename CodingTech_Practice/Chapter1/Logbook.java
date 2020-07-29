import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;

// ���ǹ����� NullPointerException ���ϱ�
public class Logbook {
	void writeMessage(String message, Path location) throws IOException {
//		if(Files.isDirectory(location)) {
		if(location == null || Files.isDirectory(location))
			throw new IllegalArgumentException("The path is invalid!");
		}
//		if(message.trim().equals("") || message == null) {
	    if(message == null || message.trim().isEmpty()) {
			throw new IllegalArgumentException("The message is invalid!");
		}
		String entry = LocalDate.now() + ": " + message;
		Files.write(location, Collections.singletonList(entry),
				StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}
}
