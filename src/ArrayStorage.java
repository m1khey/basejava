/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size;

    void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    void save(Resume r) {

        storage[size] = r;

        ++size;
    }

    Resume get(String uuid) {
        Resume resume = null;

        for (int i = 0; i < size; i++) {
            if (storage[i].uuid == uuid) {
                resume = storage[i];
                break;
            }
        }
        return resume;
    }

    void delete(String uuid) {
        Resume r;

        for (int i = 0; i < size; i++) {
            if (storage[i].uuid == uuid) {
                storage[i] = null;
                if (i != size - 1) {
                    r = storage[size - 1];
                    storage[size - 1] = storage[i];
                    storage[i] = r;
                }
            }
            break;
        }
        --size;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] resumes = new Resume[size];

        for (int i = 0; i < resumes.length; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    int size() {
        return size;
    }
}