package StepDefinitionsHook;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitionsHook"},
tags="@saucePFHook",
plugin= {"pretty","html:target/HtmlReports/htmlreport.html","pretty","json:target/JSONReports/jsonreport.json","junit:target/xmlReports/xmlreport.xml"}

)
public class TestRunner24Hook {

}

