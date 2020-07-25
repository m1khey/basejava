package exception;

public class NotExistStorageException extends StorageException {

    public NotExistStorageException(String uuid) {
        super("Resumr" + uuid +"not exsist",uuid);
    }
}
