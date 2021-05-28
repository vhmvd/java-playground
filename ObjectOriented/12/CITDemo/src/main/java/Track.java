/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Track {
  private String trackID;
  private String trackName;
  
  public Track()
  {
  }
  
  public Track(String trackID, String trackName)
  {
    this.trackID = trackID;
    this.trackName = trackName;
  }
  
  public void print()
  {
    System.out.println("\nTrack ID: " + trackID + "\nTrack Name: " + trackName);
  }
  
  public void setAll(String trackID, String trackName)
  {
    this.trackID = trackID;
    this.trackName = trackName;
  }
  
  public String getAll()
  {
    return toString();
  }

  public String getTrackID() {
    return trackID;
  }

  public String getTrackName() {
    return trackName;
  }

  public void setTrackID(String trackID) {
    this.trackID = trackID;
  }

  public void setTrackName(String trackName) {
    this.trackName = trackName;
  }
  
  @Override
  public String toString()
  {
    return "\nTrack ID: " + trackID + "\nTrack Name: " + trackName;
  }
}
