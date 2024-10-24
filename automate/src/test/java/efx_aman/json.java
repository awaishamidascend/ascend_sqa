package efx_aman;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class json {
    public static Stream<AmanVO> setUpData() {

    // Read credentials from JSON file using Gson
    Gson gson = new Gson();
        try (
    FileReader reader = new FileReader("jsons/Users/Aman_Users1.json")) {
        // Deserialize into AmanVO Object
        AmanVO wrapper = gson.fromJson(reader, AmanVO.class);
        // Return the stream of users
        return wrapper.getUsers().stream();
    } catch (
    IOException e) {
        e.printStackTrace();
    }
        return Stream.empty();
}

}
