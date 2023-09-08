import java.rmi.server.ObjID;

public class ObjectUtils {

        public static int generateIntID() {
                      ObjID uid = new ObjID();
                      return uid.hashCode();
        }

}