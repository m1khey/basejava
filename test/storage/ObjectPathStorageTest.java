package storage;

import storage.serializer.ObjectStreamSerializer;

import static org.junit.Assert.*;

public class ObjectPathStorageTest extends AbstractStorageTest{

    public ObjectPathStorageTest (){
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(),new ObjectStreamSerializer()));
    }

}