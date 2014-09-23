import conf.Configuration;
import ipc.RPC;


public class Service {

    public Service() {
    }
    
    public void start() throws Exception{
        RPC.getServer(Service.class, this, "0.0.0.0", 3380, new Configuration());
    }
    
    public static void main(String[] args) throws Exception{
        Service service = new Service();
        service.start();
    }
}
