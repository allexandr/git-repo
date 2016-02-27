package resources;

/**
 * Created by alex on 27.02.2016.
 */
public class ResourceServer {

    private TestResource resource;


    public ResourceServer(TestResource resource) {
        this.resource = resource;
    }

    public String getName() {
        return resource.getName();
    }

    public int getAge() {
        return resource.getAge();
    }

    public void setName(String name) {
        resource.setName(name);
    }

    public void setAge(int age) {
        resource.setAge(age);
    }
}
