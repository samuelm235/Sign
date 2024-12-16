public class Sign
{
    private String message;
    private int wide;
    public Sign(String text, int width)
    {
        message = text;
        wide = width;

    }
    public int numberOfLines()
    {
        if(message.length()%wide == 0) return message.length()/wide;
        return message.length()/wide + 1;
    }
    public String getLines()
    {
        String divided = ""; 
        for(int i = 0; i < message.length(); i += wide)
        {
            if(i + wide >= message.length())
            {
                divided += message.substring(i);
            }
            else divided += message.substring(i,i+wide) + ";";
        }
        return divided;
    }
}