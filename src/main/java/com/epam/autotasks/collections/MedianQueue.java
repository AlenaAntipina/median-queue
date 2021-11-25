package com.epam.autotasks.collections;

import java.util.AbstractQueue;
import java.util.Iterator;

class MedianQueue<E extends Comparable<E>> extends AbstractQueue<E> {

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean offer(final E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E poll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException();
    }
}
