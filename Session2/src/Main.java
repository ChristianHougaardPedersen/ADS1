import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Camera camera1 = new Camera("1", "AwesomeCam");
        Camera camera2 = new Camera("1", "AwesomeCam");
        Camera camera3 = new Camera("3", "AwesomeCam");
        System.out.println(camera1.equals(camera2));
        System.out.println(camera1.equals(camera3));


        HashMap<Camera, Integer> cameraMap = new HashMap<>();
        cameraMap.put(camera1, 1);
        System.out.println(cameraMap.get(camera2));
    }
}