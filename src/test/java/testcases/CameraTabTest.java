package testcases;

import org.testng.annotations.Test;

import objectrepository.MyAccountPage;

public class CameraTabTest extends BaseClassTest {
	
	MyAccountPage camera;
	
	@Test
	public void cameraTab() {
		
		camera=new MyAccountPage(driver);
		camera.cameras().click();
		//guoiou
			
	}
	
	
	
	
	
	
	

}
