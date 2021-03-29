
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

  public Time(int day, int month, int year, int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int compareTime(Time t2) {
    if (year < t2.getYear()) {
      return -1;
    } else if (year == t2.getYear() && month < t2.getMonth()) {
      return -1;
    } else if (year == t2.getYear() && month == t2.getMonth() && day < t2.getDay()) {
      return -1;
    } else if (year == t2.getYear() && month == t2.getMonth() && day == t2.getDay()
      && hour < t2.getHour()) {
      return -1;
    } else if (year == t2.getYear() && month == t2.getMonth() && day == t2.getDay()
      && hour == t2.getHour() && minute < t2.getMinute()) {
      return -1;
    }

    if (year > t2.getYear()) {
      return 1;
    } else if (year == t2.getYear() && month > t2.getMonth()) {
      return 1;
    } else if (year == t2.getYear() && month == t2.getMonth() && day > t2.getDay()) {
      return 1;
    } else if (year == t2.getYear() && month == t2.getMonth() && day == t2.getDay()
      && hour > t2.getHour()) {
      return 1;
    } else if (year == t2.getYear() && month == t2.getMonth() && day == t2.getDay()
      && hour == t2.getHour() && minute > t2.getMinute()) {
      return 1;
    }

    return 0;
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
