package creational.singleton;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 09:31
 */
public class Singleton {
        private static Singleton instance;

        // Private constructor to prevent instantiation from outside the class
        private Singleton() {
        }

        // Public method to get the instance of the Singleton class
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        // Example method of the Singleton class
        public void showMessage() {
            System.out.println("Hello, I am a Singleton!");
        }

        // Example usage
        public static void main(String[] args) {
            // Get the Singleton instance
            Singleton singletonInstance = Singleton.getInstance();

            // Call a method on the Singleton instance
            singletonInstance.showMessage();
        }
    }


