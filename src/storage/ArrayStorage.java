package storage;

import model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size;

    public void clear() {
        Arrays.fill(storage, null);

        size = 0;
    }

    public void save(Resume r) {
        if (getIndex(r.getUuid()) == -1) {
            storage[size] = r;

            size++;
        } else {
            System.out.println("Resume " + r + " exist");
        }
    }

    public void update(Resume r) {
        if (getIndex(r.getUuid()) == -1) {
            System.out.println("Resume " + r + " not exist ");
        }
    }

    public Resume get(String uuid) {
        if (getIndex(uuid) == -1) {
            System.out.println("Resume " + uuid + " not exist ");
            return null;
        }
        return storage[getIndex(uuid)];
    }

    public void delete(String uuid) {
        if (getIndex(uuid) == -1) {
            System.out.println("Resume " + uuid + " not exist ");
        }

        storage[getIndex(uuid)] = storage[size - 1];
        storage[size - 1] = null;
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        Resume[] resumes = Arrays.copyOf(storage, size);

        return resumes;
    }

    public int size() {
        return size;
    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return i;
            }
        }
        return -1;
    }
}