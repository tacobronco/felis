package net.mollrow.felis.irc;

import net.mollrow.felis.FelisException;
import net.mollrow.felis.util.SocketReader;
import net.mollrow.felis.util.SocketWriter;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Logan Blackburn
 */
public class Server {
	/**
	 * holds the connection to the irc.~~~~.net server
	 */
	private Socket connection;

	/**
	 * Queue for pushing data to the connection via the SocketWriter
	 * assign with the instance from the SocketWriter
	 */
	private Queue<String> out;

	/**
	 * Queue for pulling data from the connection via the SocketReader
	 * assign with the instance from the SocketReader
	 */
	private Queue<String> in;

	/**
	 * Both are used for threaded communication with the irc.~~~~.net server
	 */
	private SocketReader reader;
	private SocketWriter writer;

	public Server(String host, Integer port) throws FelisException {
		if(host == null || host.split(".").length != 3) {
			throw new FelisException("Server Host Invalid: " + host);
		}
		if(port == null || port < 0) {
			throw new FelisException("Server Port Invalid: " + port);
		}
		if(port != 6667) {
			//todo: log warning about ports other than 6667
		}
		//todo: log valid host/port for server
		try {
			connection = new Socket(host, port);
		} catch(UnknownHostException e) {
			throw new FelisException("Host "+host+" Could Not Be Found", e);
		} catch(IOException e) {
			throw new FelisException("Error Occured Connecting To "+host+":"+port, e);
		}
		reader = new SocketReader(connection);
		writer = new SocketWriter(connection);

		out = writer.getSource();
		in = reader.getTarget();
	}

}
