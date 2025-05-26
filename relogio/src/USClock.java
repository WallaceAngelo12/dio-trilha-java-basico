public class USClock extends Clock {

    private String periodIndicator; // "AM" ou "PM"

    public USClock(int hour, int minute, int second, String periodIndicator) {
        super(hour, minute, second);
        this.periodIndicator = periodIndicator;
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator) {
        this.periodIndicator = periodIndicator;
    }

    @Override
    public Clock convert(Clock clock) {
        int hour = clock.getHour();
        String period;

        if (hour >= 12) {
            period = "PM";
            if (hour > 12) {
                hour -= 12;
            }
        } else {
            period = "AM";
            if (hour == 0) {
                hour = 12;
            }
        }

        return new USClock(hour, clock.getMinute(), clock.getSecond(), period);
    }

    @Override
    public String getTime() {
        return String.format("%02d:%02d:%02d %s", getHour(), getMinute(), getSecond(), getPeriodIndicator());
    }
}
