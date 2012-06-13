package net.mollrow.felis.util;

import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Logan Blackburn
 */
public class SocketWriter extends Thread{
	/**
	 * Socket to put messages on
	 */
	private Socket target;

	/**
	 * Queue to pull messages off
	 */
	private Queue<String> source;

	/**
	 * Takes a socket to push lines read from a Queue it creates
	 * @param target Socket being written to
	 */
	public SocketWriter(Socket target) {
		this.target = target;
		source = new LinkedList<>();
	}

	/**
	 * Loop to run
	 * Considerations: don't want to lock down other threads
	 */
	public void run() {

	}
}
