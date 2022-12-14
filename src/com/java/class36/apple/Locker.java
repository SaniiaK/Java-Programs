package com.java.class36.apple;

public interface Locker {
    void lock();
    void unlock();
}

interface FaceId extends Locker {

}
interface TouchId extends Locker{

}
