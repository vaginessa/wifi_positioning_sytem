package wifi_positioning;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test
{
	public static void main(
			final String[] args) throws SocketException, UnknownHostException
	{
		NetworkInterface ni = NetworkInterface.getByName("l0");

		byte[] bytes = ni.getHardwareAddress();

		/* Formats the bytes into a readable MacAddress. */
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < bytes.length; ++i)
			sb.append(String.format("%02X%s", bytes[i], (i < (bytes.length - 1)) ? ":" : ""));
		System.out.println(sb.toString());
	}
}
