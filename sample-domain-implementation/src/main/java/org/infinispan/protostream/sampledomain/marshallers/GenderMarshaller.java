package org.infinispan.protostream.sampledomain.marshallers;

import org.infinispan.protostream.EnumMarshaller;
import org.infinispan.protostream.sampledomain.User;

/**
 * @author anistor@redhat.com
 */
public class GenderMarshaller implements EnumMarshaller<User.Gender> {

   @Override
   public Class<? extends User.Gender> getJavaClass() {
      return User.Gender.class;
   }

   @Override
   public String getTypeName() {
      return "sample_bank_account.User.Gender";
   }

   @Override
   public User.Gender decode(int enumValue) {
      switch (enumValue) {
         case 0:
            return User.Gender.MALE;
         case 1:
            return User.Gender.FEMALE;
      }
      return null;
   }

   @Override
   public int encode(User.Gender gender) {
      return gender == User.Gender.MALE ? 0 : 1;
   }
}
