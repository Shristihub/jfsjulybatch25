package com.testcases;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages(value = {"com.testcases"})
//ONLY the testcases in this package will be tested
//@IncludePackages(value = {"com.testcases.examples"})

//the testcases in this package will NOT be tested
@ExcludePackages(value = {"com.testcases.examples"})
public class AllTestSuite {

}
