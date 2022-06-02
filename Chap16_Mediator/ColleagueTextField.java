import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague{
	
	private Mediator mediator;
	
	public ColleagueTextField(String text, int columns) {
		super(text, columns);
	}

	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);		
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		mediator.colleagueChanged();
	}

}
