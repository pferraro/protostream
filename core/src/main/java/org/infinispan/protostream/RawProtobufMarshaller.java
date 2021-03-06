package org.infinispan.protostream;

import java.io.IOException;

/**
 * A marshaller for message types that has direct access to the low level Protobuf streams to read and write tags in an
 * unchecked manner. Cannot be used for enums. The access is not verified against a Protobuf definition as it would
 * normally happen in case of {@link MessageMarshaller}. This is usually used to provide more flexible or generic
 * marshallers, not tied to a specific schema.
 *
 * @author anistor@redhat.com
 * @since 1.0
 */
public interface RawProtobufMarshaller<T> extends BaseMarshaller<T> {

   T readFrom(ImmutableSerializationContext ctx, RawProtoStreamReader in) throws IOException;

   void writeTo(ImmutableSerializationContext ctx, RawProtoStreamWriter out, T t) throws IOException;
}
