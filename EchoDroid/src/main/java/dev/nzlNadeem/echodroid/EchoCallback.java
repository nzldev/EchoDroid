/*
 * EchoCallback.java
 * devsmine © 2020
 */
package dev.nzlNadeem.echodroid;

import io.socket.client.Ack;
import io.socket.emitter.Emitter;

/**
 * Echo callback.
 */
public interface EchoCallback extends Emitter.Listener, Ack {
}
