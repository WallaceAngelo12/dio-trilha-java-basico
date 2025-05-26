public class BRLClock extends Clock {

    public BRLClock() {
        super();
    }

    public BRLClock(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    @Override
    public Clock convert(Clock clock) {
        int hour = 0;
        int minute = clock.getMinute();
        int second = clock.getSecond();

        if (clock instanceof USClock) {
            USClock us = (USClock) clock;
            hour = us.getHour();

            if (us.getPeriodIndicator().equalsIgnoreCase("PM") && hour != 12) {
                hour += 12;
            } else if (us.getPeriodIndicator().equalsIgnoreCase("AM") && hour == 12) {
                hour = 0;
            }

        } else if (clock instanceof BRLClock) {
            BRLClock brl = (BRLClock) clock;
            hour = brl.getHour();
        }

        return new BRLClock(hour, minute, second);
    }
}
