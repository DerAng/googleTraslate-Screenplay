package runners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		features = "src/test/resources/features/google_traslate.feature" ,
		glue = "stepsdefinitions"	 
)

public class GoogleTraslateRunner {

}
