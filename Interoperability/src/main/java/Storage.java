package com.knoldus;

/**
 * A class representing a storage of objects.
 */
public class Storage {
    private Object[] elements;
    private int size;

    public Storage(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public void addElement(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Storage is full.");
        }
        elements[size++] = element;
    }

    public void removeElement(Object element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException("Element not found.");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    public void removeAll() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean checkIfContains(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}

