import java.io.File;
import java.io.RandomAccessFile;

public class FileSeek {
	public static void main(String[] args) throws Exception {
		File file = new File("demo.txt");
		RandomAccessFile access = new RandomAccessFile(file, "rw");
		System.out.println(access.readLine());
		access.seek(file.length());
		access.writeBytes("Truth is more important than facts");
		access.close();
	}
}
