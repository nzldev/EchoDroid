/*
 * AbstractChannel.java
 * devsmine © 2020
 */
package dev.nzlNadeem.echodroid.channel;

import dev.nzlNadeem.echodroid.EchoCallback;

/**
 * This class represents a basic channel.
 */
public abstract class AbstractChannel {

    /**
     * Listen for an event on the channel.
     *
     * @param event    event name
     * @param callback when event is received
     * @return this channel
     */
    public abstract AbstractChannel listen(String event, EchoCallback callback);

    /**
     * Listen for an event on the channel.
     *
     * @param callback when event is received
     * @return this channel
     */
    public AbstractChannel notification(EchoCallback callback) {
        return listen(".Illuminate\\\\Notifications\\\\Events\\\\BroadcastNotificationCreated", callback);
    }

    /**
     * Listen for a whisper event on the channel.
     *
     * @param event    event name
     * @param callback when event is received
     * @return this channel
     */
    public AbstractChannel listenForWhisper(String event, EchoCallback callback) {
        return listen(".client-" + event, callback);
    }
}
