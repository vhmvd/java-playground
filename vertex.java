public class vertex
{
    String locationName;
    vertex nextVertex;
    vertex nextLocation;
    int distance;
    int time;
    vertex()
    {
        locationName = null;
        nextVertex = null;
        nextLocation = null;
        distance=0;
        time=0;
    }
    public void LocationSetter(String s)
    {
        this.locationName = s;
    }
    public void DistanceTimeSetter(int a, int b)
    {
        this.distance = a;
        this.time = b;
    }
}