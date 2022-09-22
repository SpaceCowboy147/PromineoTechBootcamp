package week5;

public class spaceLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(log.replace("", " ").trim());
	}

	@Override
	public void error(String error) {
		System.out.println("Error: " + error.replace("", " ").trim());

}
}