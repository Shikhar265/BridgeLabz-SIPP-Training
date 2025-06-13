class Pen
{
    public static void main(String args[])
    {
	int pen=14,student=3;
	int extra=pen%student;
	int remain=pen-extra;
	int ans=remain/student;
	System.out.print("The pen Per Student is "+ans+" and the remaining pen not distributed is "+extra);
    }
}