package com.testcases;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages(value = {"com.testcases"})
@IncludeTags(value = {"simple","prod"})

public class TagTests {

}
