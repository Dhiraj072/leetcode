package com.github.dhiraj072.leetcode.solutions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = {"@Smoke", "~@Ignore"})
public class CucumberTestRunner {

}
