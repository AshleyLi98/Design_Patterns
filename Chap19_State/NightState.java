
public class NightState implements State{
	
	private static NightState singleton = new NightState();
	
	private NightState() {}
	
	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		
		if(9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
		
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		
		context.callSecurityCenter("USE!!(Night)");
		
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Alarm(Night)");
		
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("Call(Night)");
	}
	
	public String toString() {
		return "[Night]";
	}

}
