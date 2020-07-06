/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size;

    void clear() {
        for (Resume r : storage
        ) {
            r = null;
        }
        size = 0;
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                size++;
                break;
            }
        }
    }

    Resume get(String uuid) {
        Resume resume = null;

        for (Resume r : getAll()
        ) {
            if (r.uuid == uuid) {
                resume = r;
                break;
            }
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
        Resume[] resumes = new Resume[size];
        Resume resume;

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
        return size;
    }
}