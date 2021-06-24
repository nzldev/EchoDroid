/*
 * SocketIOPresenceChannel.java
 * devsmine © 2020
 */
package dev.nzlNadeem.echodroid.channel;

import io.socket.client.Socket;
import dev.nzlNadeem.echodroid.EchoCallback;
import dev.nzlNadeem.echodroid.EchoOptions;

/**
 * This class represents a Socket.io presence channel.
 */
public class SocketIOPresenceChannel extends SocketIOPrivateChannel implements IPresenceChannel {

    /**
     * Create a new Socket.IO presence channel.
     *
     * @param socket  the socket
     * @param name    channel name
     * @param options Echo options
     */
    public SocketIOPresenceChannel(Socket socket, String name, EchoOptions options) {
        super(socket, name, options);
    }

    @Override
    public IPresenceChannel here(EchoCallback callback) {
        on("presence:subscribed", callback);

        return this;
    }

    @Override
    public IPresenceChannel joining(EchoCallback callback) {
        on("presence:joining", callback);

        return this;
    }

    @Override
    public IPresenceChannel leaving(EchoCallback callback) {
        on("presence:leaving", callback);

        return this;
    }
}
