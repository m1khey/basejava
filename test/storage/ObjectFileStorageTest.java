package storage;

import storage.serializer.ObjectStreamSerializer;

import static org.junit.Assert.*;

public class ObjectFileStorageTest extends AbstractStorageTest{

    public ObjectFileStorageTest (){
        super(new FileStorage(STORAGE_DIR,new ObjectStreamSerializer()));
    }

}