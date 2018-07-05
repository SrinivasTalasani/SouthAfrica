package TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClass1;

public class Loginpage extends BaseClass1{
	
  @Test
  public void open() throws IOException {
	  BaseClass1.Open();
	  
  }
}
