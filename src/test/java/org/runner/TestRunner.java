package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources",
glue="org.stepdefinition",
dryRun=false,
plugin= {"pretty","html:target/anz.report"},
monochrome=true)
public class TestRunner {

}
