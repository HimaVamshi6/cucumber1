import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src//test//resources//TaggedFeatures//",
				glue= {"stepDefs"},
				dryRun=false,
				monochrome=true,
				tags = "@RegressionTest"
//				tags = "@SmokeTest"
//				tags = "@RegressionTest or @SmokeTest"
//				tags = "@RegressionTest and @SmokeTest"
//				tags = "not @RegressionTest and not @SmokeTest"
//				tags = "@PhaseOne or @RegressionTest"
//				tags = "@PhaseOne and @RegressionTest or @SmokeTest"
//				tags = "@RegressionTest and not @PhaseOne"

		)
public class TaggedRunner {

}
