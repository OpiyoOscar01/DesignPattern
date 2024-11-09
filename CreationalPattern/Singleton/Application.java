package CreationalPattern.Singleton;

public class Application {

   public static void main(String[] args) {
      // Get the single Logger instance
      Logger logger = Logger.getInstance();

      // Log some messages
      logger.log("Application started.");
      logger.log("Performing task...");
      logger.log("Application finished.");
      Logger logger2 = Logger.getInstance();
      logger2.log("Application started.");
   }

}

