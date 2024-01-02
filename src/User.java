import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter
public class User implements Serializable {
    long userId;
    String name;
    int age;
    void sayHello(){
        System.out.println("Welcome to serialization..");
    }
}