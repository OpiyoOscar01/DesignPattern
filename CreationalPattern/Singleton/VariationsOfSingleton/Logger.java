package CreationalPattern.Singleton.VariationsOfSingleton;

/*Eager Initialization: The instance is created at the time of class loading, rather than on demand. This is useful when the creation of the instance is lightweight and doesn't require synchronization.*/
public class Logger {
   private static final Logger instance = new Logger();

   private Logger() { }

   public static Logger getInstance() {
      return instance;
   }

   public void log(String message) {
      System.out.println("Log: " + message);
   }

   public static void main(String[] args) {
      Logger.instance.log("Hello World!");
   }
}

