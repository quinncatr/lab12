public class OpenMessage implements Message {
    private String body = "";
    private String to = "";
    private String subject = "";
    private String from = "";

    public OpenMessage(String to, String from, String subject, String body)
    {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }

    public String getBody()
    {
        return body;
    }
    public String getTo()
    {
        return to;
    }
    public String getSubject()
    {
        return subject;
    }
    public String getFrom()
    {
        return from;
    }
    
    public boolean search(String term, String part)
    {
        String t = term.toLowerCase();
        String p = part.toLowerCase();
        return p.contains(t);
    }
    public boolean searchSubject(String term)
    {
        return search(term, this.subject);
    }
    public boolean searchTo(String termString)
    {
        return search(termString, this.to);
    }
    public boolean searchFrom(String term)
    {
        return search(term, this.from);
    }
    public String toString()
    {
        String s = "TO: " + getTo() + "\n";
        s += "FROM: " + getFrom() + "\n";
        s += "SUBJECT: " + getSubject() + "\n";
        s += "BODY: " + getBody() + "\n";
        return s;
    }
    public String encrypt(String message, Key key)
    {

    }
    public String decrypt(String message, Key key)
    {

    }
}