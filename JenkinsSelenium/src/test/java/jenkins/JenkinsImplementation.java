package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsImplementation {
@Test
public void execute() {
	Reporter.log("Jenkins class has executed", true);
}
}
