package new_test;
// Import the MyUtils class from the java_basics package
// This is possible because the MyUtils class is public
// If the MyUtils class was not public, it would not be possible to import it
import java_basics.MyUtils;

public class AccessModiferBasics {
    public static void main(String[] args) {
        // Call the add10 method from MyUtils class using the import statement
        int add = MyUtils.add10(10);
    }


}


//public: Accessible anywhere.
//private: Accessible only inside the same class
//protected: Accessible within the same package and subclasses.