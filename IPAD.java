import java.io.*;
import java.net.*;
class IPAD
{
	public static void main(String a[]) throws Exception
	{
		InetAddress ia=InetAddress.getLocalHost();
		System.out.println("IP:>" + ia.getHostAddress());
	}
}