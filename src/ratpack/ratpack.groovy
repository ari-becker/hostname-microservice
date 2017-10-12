import static ratpack.groovy.Groovy.ratpack
import java.net.InetAddress

ratpack {
    serverConfig {
        port 80
    }
    handlers {
        get {
            render InetAddress.localHost.hostName
        }
    }
}
