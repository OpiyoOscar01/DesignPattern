package CreationalPattern.Singleton.VariationsOfSingleton;


/*
* Bill Pugh Singleton (Static Inner Class): This approach leverages the concept of the Java classloader mechanism to create the singleton instance in a thread-safe manner without requiring synchronization. This is considered an optimal solution for most cas*/
public class Logger2 {

      // Inner static class responsible for creating the Singleton instance
      private static class SingletonHelper {
         private static final Logger2 INSTANCE = new Logger2();
      }

      private Logger2() { }

      public static Logger2 getInstance() {
         return SingletonHelper.INSTANCE;
      }

      public void log(String message) {
         System.out.println("Log: " + message);
   }

   public static void main(String[] args) {
      Logger2 logger = Logger2.getInstance();
      logger.log("Hello World!");
   }

}
