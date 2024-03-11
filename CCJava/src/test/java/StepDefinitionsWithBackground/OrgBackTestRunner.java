package StepDefinitionsWithBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitionsWithBackground"},
tags="@backgroundorange",
plugin= {"pretty","html:target/HtmlReports/htmlreport.html","pretty","json:target/JSONReports/jsonreport.json","junit:target/xmlReports/xmlreport.xml"}

)
public class OrgBackTestRunner {

}


