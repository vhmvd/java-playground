public class MasterMindEntry {
    private String playerEntry;
    public static String masterEntry;

    public MasterMindEntry(String playerEntry) {
        this.playerEntry = playerEntry;
    }

    public String getPlayerEntry() {
        return playerEntry;
    }
    
    public String [] getPlayerEntryArray() {
        String entry = this.getPlayerEntry();
        String [] entryArray = {"","","",""};
        for (int i = 0; i < entry.length(); i++) {
            entryArray[i] = ""+entry.charAt(i);
        }
        return entryArray;
    }

    public void setPlayerEntry(String playerEntry) {
        this.playerEntry = playerEntry;
    }

    public static String getMasterEntry() {
        return masterEntry;
    }

    public static void setMasterEntry(String gameEntry) {
        MasterMindEntry.masterEntry = gameEntry;
    }

    public String getFeedback() {
        if (this.playerEntry.equals(masterEntry)) {
            return "YYYY";
        } else {

            String feedback = "";
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (playerEntry.charAt(i) == masterEntry.charAt(j)) {
                        if (i == j) {
                            feedback += "Y";
                        } else {
                            feedback += "X";
                        }
                    }

                }
            }
            return feedback;
        }
    }
    
    public String [] getFeedbackArray(){
        String feedback = this.getFeedback();
        String [] feedArray = {"","","",""};
        for (int i = 0; i < feedback.length(); i++) {
            feedArray[i] = ""+feedback.charAt(i);
        }
        return feedArray;
    }
    
    
}