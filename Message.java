public class  Message
{
    public String messageFor;
    public String messageFrom;
    public String text;

    public  Message(String whoFor, String whoFrom, String info)
    {
	messageFor = whoFor;
	messageFrom = whoFrom;
	text = info;
    }
}