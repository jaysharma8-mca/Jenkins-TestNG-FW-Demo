package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void NativeAppAndroid() {
		System.out.println("NativeAppAndroid");
	}
	
	@Test
	public void IosApps() {
		System.out.println("IosApps");
	}
}

//mvn -Dtest=NativeAppAndroid test -- to run single test