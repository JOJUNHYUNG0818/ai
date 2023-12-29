package javaApp5.ch17.sec01;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx03 {

	public static void main(String[] args) throws Exception {
		
		Path path = Paths.get(StreamEx03.class.getResource("data.txt").toURI());
		Stream<String> fileStream = Files.lines(path);
		fileStream.forEach(line->System.out.println(line));
		fileStream.close();

	}

}
