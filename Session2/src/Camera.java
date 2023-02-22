import java.util.Objects;

public class Camera {
    private String id;
    private String model;

    public Camera(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Camera))
            return false;
        Camera other = (Camera) obj;
        boolean equalModels = (this.model == null && other.getModel() == null)
                ||
                (this.model != null && this.model.equals(other.getModel()));
        boolean equalIds = (this.id == null && other.getId() == null)
                ||
                (this.id != null && this.id.equals(other.getId()));
        return equalModels && equalIds;
    }

    @Override
    public int hashCode() {
        int result = this.id.hashCode() + this.model.hashCode();
        result = 31 * result;
        return result;
    }
}
