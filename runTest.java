/**
 * @author Daniel Brennan
 * Run basic jUnit Testing for leet challenge
 */

import org.junit.runner.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class runTest {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestNoob.class);
		System.out.println("Noob to Leet Test Results: ");
		for (Failure failure : result.getFailures())
			System.out.println(failure);
		if(result.wasSuccessful())
			System.out.println("Tests Finished successfully.");
	}
}
