package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_test;
import Generic.ReadingExcel_generic;
import pomconcept.POMConcept1;

public class TS_1 extends Base_test 
{

	@Test
	public void Script() throws EncryptedDocumentException, IOException
	{
		String username = ReadingExcel_generic.getData("Sheet1", 0, 0);
		String password = ReadingExcel_generic.getData("Sheet1", 1, 0);
		POMConcept1 pmc=new POMConcept1(driver);
		pmc.email(username);
		pmc.password(password);
		Assert.fail();
		pmc.Loginbtn();
	}
}
