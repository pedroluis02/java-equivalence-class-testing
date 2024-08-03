package com.github.pedroluis02.equivalenceclasstesting;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SuppressWarnings("squid:S2187")
@Suite
@SuiteDisplayName("Suit of All Tests")
@SelectPackages("com.github.pedroluis02.equivalenceclasstesting")
@IncludeClassNamePatterns(".*Test")
class AllPackageTests {
}
