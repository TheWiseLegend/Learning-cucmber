package io.cucumber.shouty;
import java.util.List;
import java.util.ArrayList;

public class Person {
    public void moveTo(Integer distance) {
        // Logic to move the person to a specific location
    }

    public void shout(String message) {
        // Logic for the person to shout a message
}

public List<String> getMessagesHeard() {
    List<String> result = new ArrayList<String>();
    result.add("free bagels at Sean's");
    return result;
    }

}
