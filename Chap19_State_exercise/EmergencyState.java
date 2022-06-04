
public class EmergencyState implements State{
	
	private static EmergencyState singleton = new EmergencyState();
	
	private EmergencyState() {}
	
	public static EmergencyState getInstance() {return singleton;}

	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("USE(Emergency)");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("ALARM(Emergency)");
		
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("PHONE(Emergency)");
		
	}

}
