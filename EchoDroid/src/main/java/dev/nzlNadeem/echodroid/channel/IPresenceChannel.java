/*
 * IPresenceChannel.java
 * devsmine © 2020
 */
package dev.nzlNadeem.echodroid.channel;

import dev.nzlNadeem.echodroid.EchoCallback;

/**
 * This interface represents a presence channel.
 */
public interface IPresenceChannel {

    /**
     * Register a callback to be called anytime the member list changes.
     *
     * @param callback callback
     * @return the channel
     */
    IPresenceChannel here(EchoCallback callback);

    /**
     * Listen for someone joining the channel.
     *
     * @param callback callback
     * @return the channel
     */
    IPresenceChannel joining(EchoCallback callback);

    /**
     * Listen for someone leaving the channel.
     *
     * @param callback callback
     * @return the channel
     */
    IPresenceChannel leaving(EchoCallback callback);
}
