package exception;

public class ExistStorageException extends StorageException {
    public ExistStorageException(String uuid) {
        super("Resumr " + uuid + " already exist ", uuid);
    }
}
