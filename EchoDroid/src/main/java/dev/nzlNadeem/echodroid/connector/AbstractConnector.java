/*
 * AbstractConnector.java
 * devsmine © 2020
 */
package dev.nzlNadeem.echodroid.connector;

import dev.nzlNadeem.echodroid.EchoCallback;
import dev.nzlNadeem.echodroid.EchoOptions;
import dev.nzlNadeem.echodroid.channel.AbstractChannel;

/**
 * Represent a connector to a Echo server.
 */
public abstract class AbstractConnector {

    /**
     * Echo options.
     */
    protected EchoOptions options;

    /**
     * Create a new connector.
     *
     * @param options options
     */
    public AbstractConnector(EchoOptions options) {
        this.options = options;
    }

    /**
     * Create a fresh connection.
     *
     * @param success callback when success
     * @param error   callback when error
     */
    public abstract void connect(EchoCallback success, EchoCallback error);

    /**
     * Get a channel instance by name.
     *
     * @param channel channel name
     * @return the channel
     */
    public abstract AbstractChannel channel(String channel);

    /**
     * Get a private channel instance by name.
     *
     * @param channel channel name
     * @return the channel
     */
    public abstract AbstractChannel privateChannel(String channel);

    /**
     * Get a presence channel instance by name.
     *
     * @param channel channel name
     * @return the channel
     */
    public abstract AbstractChannel presenceChannel(String channel);

    /**
     * Leave the given channel.
     *
     * @param channel channel name
     */
    public abstract void leave(String channel);

    /**
     * @return if the socket is connected to the server.
     */
    public abstract boolean isConnected();

    /**
     * Disconnect from the Echo server.
     */
    public abstract void disconnect();
}
