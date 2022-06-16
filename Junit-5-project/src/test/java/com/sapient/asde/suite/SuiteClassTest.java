package com.sapient.asde.suite;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.sapient.asde.service")
//@SelectClasses({com.sapient.asde.service.HelloWorldLatestTest.class, com.sapient.asde.service.HelloWorldTest.class})
public class SuiteClassTest {

}
