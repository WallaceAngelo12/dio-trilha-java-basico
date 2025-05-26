public abstract class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock() {
        this(0, 0, 0);
    }

    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 23.");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minuto deve estar entre 0 e 59.");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Segundo deve estar entre 0 e 59.");
        }
        this.second = second;
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public abstract Clock convert(Clock clock);
}
