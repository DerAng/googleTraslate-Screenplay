package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.GoogleTraslatePage;

public class TraslateWord implements Task{

	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitUntil.the(GoogleTraslatePage.LANGUAGE_TWO, WebElementStateMatchers.isVisible()));
		actor.attemptsTo(Click.on(GoogleTraslatePage.LANGUAGE_TWO));
		actor.attemptsTo(Click.on(GoogleTraslatePage.SELECT_SPANISH));
		actor.attemptsTo(WaitUntil.the(GoogleTraslatePage.LANGUAGE_ONE, WebElementStateMatchers.isVisible()));
		actor.attemptsTo(Click.on(GoogleTraslatePage.LANGUAGE_ONE));
		actor.attemptsTo(Click.on(GoogleTraslatePage.SELECT_ENGLISH));
		actor.attemptsTo(Enter.theValue("Teacher").into(GoogleTraslatePage.TYPEWORD));
	}
	
	
	public static TraslateWord theApp() {
		return instrumented(TraslateWord.class);
		
	}

}
