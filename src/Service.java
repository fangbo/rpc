import ipc.RPC;
import ipc.Server;
import conf.Configuration;


public class Service implements ServiceProtocol{

    private Server server;
    
    public Service() {}
    
    public String helloWorld() {
        return "Hello World";
    }
    
    public void start() throws Exception{
        this.server = RPC.getServer(Service.class, this, "127.0.0.1", 3380, new Configuration());
        this.server.start();
    }
    
    public static void main(String[] args) throws Exception{
        Service service = new Service();
        service.start();
    }
}