/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size;

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
        size=0;
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                break;
            }
        }
    }

    Resume get(String uuid) {
        Resume resume = null;

        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid == uuid)
                resume = storage[i];
            break;
        }
        return resume;
    }

    void delete(String uuid) {
        Resume r;

        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid == uuid && i != size - 1) {
                r = storage[size - 1];
                storage[i] = r;
                storage[size - 1] = null;
                --size;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] resumes = new Resume[this.size];
        Resume resume;

        try {
            if (size==0);
        } catch (NullPointerException e) {
            return null;
        }

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                resume = storage[i];
                for (int j = 0; j < resumes.length; j++) {
                    if (resumes[j] == null) {
                        resumes[j] = resume;
                        break;
                    }
                }
            }
        }
        return resumes;
    }

    int size() {
        size = 0;

        for (int o = 0; o < storage.length; o++) {
            if (storage[o] != null)
                size++;
        }
        return size;
    }
}