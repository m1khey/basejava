/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
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

        Resume resume=null;

        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid == uuid)
                resume=storage[i];
                break;
        }
        return resume;
    }

    void delete(String uuid) {

        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid == uuid) {
                storage[i] = null;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] retArr = new Resume[size()];
        Resume resume;

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                resume = storage[i];
                for (int j = 0; j < retArr.length; j++) {
                    if (retArr[j] == null) {
                        retArr[j] = resume;
                        break;
                    }
                }
            }
        }
        return retArr;
    }

    int size() {
        int m = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                ++m;
            }
        }
        return m;
    }
}