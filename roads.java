class roads
{
    String locationName;
    int distance;
    int time;
    roads next;
    roads()
    {
        locationName=null;
        distance=0;
        time=0;
        next=null;
    }
    public void setter(String s, int a, int b)
    {
        this.distance = a;
        this.locationName = s;
        this.time = b;
    }
}