public class Time {

  private int hour;
  private int minute;
  private int day;
  private int month;
  private int year;

  public Time() {
    this.hour = 0;
    this.minute = 0;
    this.day = 0;
    this.month = 0;
    this.year = 0;
  }

  public Time(int hour, int minute, int day, int month, int year) {
    this.hour = hour;
    this.minute = minute;
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int compareTime(Time t2) {
    if (year == t2.year && month == t2.month && day == t2.day
      && hour == t2.hour && minute == t2.minute) {
      return 0;
    }

    if (year > t2.year) {
      return 1;
    }

    if (year == t2.year && month > t2.month) {
      return 1;
    }

    if (year == t2.year && month == t2.month && day > t2.day) {
      return 1;
    }

    if (year == t2.year && month == t2.month && day == t2.day
      && hour > t2.hour) {
      return 1;
    }

    if (year == t2.year && month == t2.month && day == t2.day
      && hour == t2.hour && minute > t2.minute) {
      return 1;
    }

    return -1;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return "Time\n" + day + "-" + month + "-" + year + "/" + hour + ":" + minute;
  }

}
