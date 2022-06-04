
public class DayState implements State{
	
	private static DayState singleton = new DayState();
	
	private DayState() {}
	
	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		
		if(hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		} else if(hour >= 12 && hour < 13) {
			context.changeState(LunchTimeState.getInstance());
		}
		
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		
		context.recordLog("USE(Day)");
		
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Alarm(Day)");
		context.changeState(EmergencyState.getInstance());
		
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Call(Day)");
	}
	
	public String toString() {
		return "[Day]";
	}

}
