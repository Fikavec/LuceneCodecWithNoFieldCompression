package my;
import org.apache.lucene.codecs.FilterCodec;
import org.apache.lucene.codecs.StoredFieldsFormat;
import org.apache.lucene.codecs.lucene87.Lucene87Codec;
import org.apache.lucene.codecs.lucene87.Lucene87StoredFieldsFormat;

public final class Lucene87CodecWithNoFieldCompression extends FilterCodec {

    private final StoredFieldsFormat storedFieldsFormat; 

    public Lucene87CodecWithNoFieldCompression() {
        super("Lucene87CodecWithNoFieldCompression", new Lucene87Codec());
        storedFieldsFormat = new Lucene87StoredFieldsFormat();
    }
    @Override
    public StoredFieldsFormat storedFieldsFormat() {
        return storedFieldsFormat;
    }
    @Override
    public String toString() {
      return getClass().getSimpleName();
    }
}