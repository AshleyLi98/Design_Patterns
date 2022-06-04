
public class LunchTimeState implements State{
	
	private static LunchTimeState singleton = new LunchTimeState();
	
	private LunchTimeState() {}
	
	public static LunchTimeState getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if((hour >= 9 && hour < 12) || (hour >=13 && hour < 17)) {
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("USE(Lunch Time)");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("Alarm(Lunch Time)");
		context.changeState(EmergencyState.getInstance());
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("Call(Lunch Time)");
	}

}
