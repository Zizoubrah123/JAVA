import java.util.Date;
public class AlfredQuotes {
    
    public String guestGreeting(String name) {
        
        return String.format("hello, %s. lovely to see you", name  ) ;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("it is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // int alexisIndex = conversation.indexOf("Alexis");
        // int alfredIndex = conversation.indexOf("Alfred");

        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}

