class vertex
{
    String locationName;
    vertex next;
    roads nextLocation;
    vertex()
    {
        locationName = null;
        next = null;
        nextLocation = null;
    }
    public void setter(String s)
    {
        this.locationName = s;
    }
}