package com.hanhuy.hdhr.stream;

import java.util.EventObject;

public class PacketEvent extends EventObject {
    public final byte[] packet;
    public PacketEvent(PacketSource source, byte[] packet) {
        super(source);
        this.packet = packet;
    }
}
