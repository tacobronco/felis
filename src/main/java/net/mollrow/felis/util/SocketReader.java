package net.mollrow.felis.util;

import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Logan Blackburn
 */
public class SocketReader extends Thread{
	/**
	 * Socket to take messages off
	 */
	private Socket source;

	/**
	 * Queue to put messages on
	 */
	private Queue<String> target;

	/**
	 * Takes a socket and creates a Queue to pull lines of text to from the socket
	 * @param source Socket being read from
	 */
	public SocketReader(Socket source) {
		this.source = source;
		target = new LinkedList<>();
	}

	/**
	 * Allow server to get a queue to interact with
	 */
	public Queue<String> getTarget() {
		return target;
	}

	/**
	 * Loop to run
	 * Considerations: don't want to lock down other threads
	 */
	public void run() {

	}
}
