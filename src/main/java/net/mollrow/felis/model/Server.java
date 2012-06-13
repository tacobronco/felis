package net.mollrow.felis.model;

import net.mollrow.felis.util.SocketReader;
import net.mollrow.felis.util.SocketWriter;

import java.net.Socket;
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

}
