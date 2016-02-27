package resources;

/**
 * Created by alex on 27.02.2016.
 */
public class ResourceServerController implements ResourceServerControllerMBean{

    private  ResourceServer resourceServer;

    public ResourceServerController(ResourceServer resourceServer) {
        this.resourceServer = resourceServer;
    }

    @Override
    public String getName() {
        return resourceServer.getName();
    }

    @Override
    public int getAge() {
        return resourceServer.getAge();
    }

    @Override
    public void setName(String name) {
        resourceServer.setName(name);
    }

    @Override
    public void setAge(int age) {
        resourceServer.setAge(age);
    }


}
