package storage.serializer;

import model.*;
import util.XmlParser;

import java.io.*;

public class XmlStreamSerializer implements StreamSerializer {
    private XmlParser xmlParser;

    public XmlStreamSerializer() {
        xmlParser=new XmlParser(
                Resume.class, Organization.class, Link.class,
                OrganizationSection.class, TextSection.class,ListSection.class,Organization.Position.class);
    }

    @Override
    public void doWrite(Resume r, OutputStream os) throws IOException {
        try (Writer w = new OutputStreamWriter(os)) {
            xmlParser.marshal(r, w);
        }
    }

    @Override
    public Resume doRead(InputStream is) throws IOException {
        try (Reader r = new InputStreamReader(is)) {
            return xmlParser.unmarshall(r);
        }
    }
}
