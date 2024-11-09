package CreationalPattern.Singleton;

public class Logger {

   // Step 1: Create a static instance (volatile ensures visibility across threads)
   private static volatile Logger instance;

   // Step 2: Make the constructor private to prevent direct instantiation
   private Logger() {
      // Initialize resources (e.g., open log file)
   }

   // Step 3: Provide a public static method to access the instance
   public static Logger getInstance() {
      if (instance == null) {
         synchronized (Logger.class) {
            // Double-checked locking to ensure only one instance is created
            if (instance == null) {
               instance = new Logger();
            }
         }
      }
      return instance;
   }

   // Method to log a message
   public void log(String message) {
      System.out.println("Log: " + message);
   }
}


/*
* Private Constructor: The constructor private Logger() ensures that no new instances can be created outside the class.

Static Instance (Lazy Initialization): The static variable instance is the one and only instance of the Logger class. Initially, it's null, meaning the instance hasn't been created yet.

Double-Checked Locking: In the getInstance() method, we check if the instance is null. If so, we enter a synchronized block. The double-checking (if (instance == null) inside and outside the synchronized block) ensures that the instance is only created once and that synchronization overhead is minimized after the instance has been created.

Global Access: The getInstance() method is static, meaning it can be called without needing an object. It returns the unique Logger instance to any part of the application that needs it.

Thread Safety: The use of synchronized ensures that the class is thread-safe. This is important in multi-threaded applications where multiple threads might attempt to access the getInstance() method simultaneously.*/
