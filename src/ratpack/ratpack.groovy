import static ratpack.groovy.Groovy.ratpack
import java.net.InetAddress

ratpack {
    handlers {
        get {
            render InetAddress.localHost.hostName
        }
    }
}
