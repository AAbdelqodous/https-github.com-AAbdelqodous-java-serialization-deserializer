import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
    public static void main(String[] args) {
        User user = null;

        try(
                FileInputStream fis = new FileInputStream("C:\\Users\\ahmed.elsayed\\IdeaProjects\\SerializerApp\\user.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            user = (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(user.userId);
        System.out.println(user.name);
        System.out.println(user.age);
        user.sayHello();
    }
}
